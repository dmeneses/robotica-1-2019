package testSensorOjos;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class ultrasonicSensorPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3UltrasonicSensor ojos ;
		ojos= new EV3UltrasonicSensor (SensorPort.S4);
		float [] muestras= new float[ojos.sampleSize()];
		while(true)
		{
			ojos.fetchSample(muestras, 0 );
			double distancia = muestras[0]*100;//en cm
			
			System.out.println("distancia:" + distancia);
			EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S1);
			EV3LargeRegulatedMotor motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
		    EV3LargeRegulatedMotor motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
		//EV3UltrasonicSensor ojos;
			
			SampleProvider sp = sensor .getTouchMode();
			boolean botonActivado;
			while(true){
				float[] sample = new float [sp.sampleSize()];
				sp.fetchSample(sample, 0);
				if (sample[0] == 0){
					botonActivado = false;
					
				}
				else{ 
					
					botonActivado = true;
					 distancia = 57;
					int grados = (int)distancia*360/17;
					motorA.rotate(grados,true);
					motorC.rotate(grados);
					
				}
				System.out.println(botonActivado);
				//ojos= new EV3UltrasonicSensor (SensorPort.S4);
				 muestras= new float[ojos.sampleSize()];
				while(true)
				{
					ojos.fetchSample(muestras, 0 );
					 distancia = muestras[0]*100;//en cm
					
					System.out.println("distancia:" + distancia);
	
				
				}
			}
		}
	}
}
							


