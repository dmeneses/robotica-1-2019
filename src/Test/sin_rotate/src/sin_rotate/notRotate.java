package sin_rotate;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class notRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		 EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
		 EV3UltrasonicSensor ojos;
		 SampleProvider sp = sensor.getTouchMode();
	       boolean botonActivado;
	       
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
	      		 double distancia = muestras[0] * 100;

	      	   if (botonActivado == true){
	      		 
	      		int tiempo = (int) distancia * 1 / 15;
	      			
	      			motorB.setSpeed(300);
	      			motorC.setSpeed(300);
	      			motorB.forward();
	      			motorC.forward();
	      			Delay.msDelay(tiempo * 1050);
	      			motorB.stop(true);
	      		    motorC.stop();
	      		    
	      		  System.out.println("mira_ma_avanze: " + distancia);
	      	   }
		
	      	   }
		
		
	}

}
