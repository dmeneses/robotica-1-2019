package postas1;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class postas1 {

	public static void main(String[] args) {
	
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S2);
		SampleProvider sp = sensor.getTouchMode();
		EV3UltrasonicSensor ojos;
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
		float[]muestras = new float [ojos.sampleSize()];
		

		
	
		boolean botonActivado;
		while(true){
			float[]sample = new float [sp.sampleSize()];
			sp.fetchSample(sample,0);
			if (sample [0]==0){
				botonActivado = false;
			}else{
				botonActivado = true;
			}
			System.out.println(botonActivado);
			
			int x = 320;     //grados//
			int y = 30;      //distancia//
				int giro = x ;
				double distancia;
				/*int grados=(int)distancia*360/17;
				motorB.rotate(grados,true);
				motorC.rotate(grados);*/
				
				
			{
				ojos.fetchSample(muestras,0);
				distancia = muestras [0] * 100 ; 
				System.out.println ("Distancia:"+ distancia);
			
			if (botonActivado){
				  
				 //distancia = y;
				 int grados=(int)distancia*360/17;
				motorB.rotate(grados,true);
				motorC.rotate(grados);
				}
				
				
	
		
		}
		
		}
		
	}
}
	
	

		