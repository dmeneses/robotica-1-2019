package sensorultra;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class ultron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
         EV3UltrasonicSensor ojos;
         ojos = new  EV3UltrasonicSensor (SensorPort.S1);
         float[] muestras = new float[ojos.sampleSize()];
         
         while(true)
         {
        	 ojos.fetchSample(muestras, 0);
        	 double distancia = muestras[0] * 70;
        		int grados = (int)distancia * 360 / 17;
        		motorB.rotate(grados, true);
        		motorC.rotate(grados);
        	 
        	 System.out.println("Distancia: " + distancia);
        	 
        	 
         }
	}




	}




