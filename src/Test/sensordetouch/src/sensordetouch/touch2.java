package sensordetouch;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class touch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
			EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
				
       EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
       SampleProvider sp = sensor.getTouchMode();
       boolean botonActivado;
       
       while(true){
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
    			double distancia = 30;
    			int grados = (int)distancia * 360 / 17;
    			motorB.rotate(grados, true);
    			motorC.rotate(grados);
    			
    			/*int giro_derecha = 420;
    			int giro_izquierda = 420;
    			
    			int retro_derecha = -20;
    			int retro_izquierda = -20;
    			// prueba del cuadrado
    			motorB.rotate(grados, true);
    			motorC.rotate(grados);
    			
    			motorB.rotate(giro_derecha);
    			motorC.rotate(retro_izquierda);
    			
    			motorB.rotate(grados, true);
    			motorC.rotate(grados);
    			
    			motorB.rotate(giro_derecha);
    			motorC.rotate(retro_izquierda);
    			
    			motorB.rotate(grados, true);
    			motorC.rotate(grados);
    			
    			motorB.rotate(giro_derecha);
    			motorC.rotate(retro_izquierda);
    			
    			motorB.rotate(grados, true);
    			motorC.rotate(grados);
    			
    			motorB.rotate(giro_derecha);
    			motorC.rotate(retro_izquierda);*/
    			
    	   }
    	   System.out.println(botonActivado);
       }
	}
      
}