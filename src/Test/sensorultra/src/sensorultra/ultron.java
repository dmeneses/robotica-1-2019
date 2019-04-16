package sensorultra;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class ultron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		  EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
	       SampleProvider sp = sensor.getTouchMode();
	       boolean botonActivado;
         EV3UltrasonicSensor ojos;
         ojos = new  EV3UltrasonicSensor (SensorPort.S1);
         float[] muestras = new float[ojos.sampleSize()];
         
         while(true)
         {
        	 float[] sample = new float [sp.sampleSize()];
      	   sp.fetchSample(sample, 0);
      	   if (sample[0] == 0){
      		   botonActivado = false;
      	   }else{
      		   botonActivado = true;
      	   }
      	   if (botonActivado == true){
      			//double distancia = 60;
      			//int grados = (int)distancia * 360 / 17;
      			motorB.setSpeed(450);
      			//motorB.forward();
      			motorC.setSpeed(450);
      			//motorC.forward();
      			//Delay.msDelay(3600);
      		    //motorB.rotate(grados, true);
      			//motorC.rotate(grados);
      			//double distancia = 40;
      			//int grados = (int)distancia * 360 / 17;
        	 ojos.fetchSample(muestras, 0);
        	 double distancia = muestras[0] * 100;
        		int grados = (int)distancia * 360 / 17;
        		motorB.rotate(grados, true);
        		motorC.rotate(grados);
        	 
        	 System.out.println("Distancia: " + distancia);
        	 
        	 
         }
	}




	}
}



