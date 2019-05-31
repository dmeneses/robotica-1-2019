

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;




public class Robot {
	
	EV3LargeRegulatedMotor motorA;
	EV3MediumRegulatedMotor motorD;
	  EV3LargeRegulatedMotor motorC ;
	EV3ColorSensor sensorCodigo;
	EV3TouchSensor motorB;
	EV3TouchSensor motorV;
	
	
	SampleProvider sp;
	float[] muestras;
	
	
	public Robot()
	{
		motorB = new  EV3TouchSensor(SensorPort.S1);
	    motorV = new  EV3TouchSensor(SensorPort.S4);
		motorD = new  EV3MediumRegulatedMotor(MotorPort.D);
		motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	    motorC = new  EV3LargeRegulatedMotor(MotorPort.C);     
	     sensorCodigo = new  EV3ColorSensor(SensorPort.S3);	
	     
	
	 	 	
	     sp = sensorCodigo.getRedMode();
	     muestras = new float[sp.sampleSize()];
	        
	        motorA.setSpeed(700);
			motorA.forward();
	     
			
			motorC.setSpeed(700);
			motorC.forward();
	     
	}
	public void pelear() {
		while (true){
			SampleProvider sp8 = motorB.getTouchMode();
			boolean botonActivado;
			float[] sample = new float [sp8.sampleSize()];
			sp8.fetchSample(sample, 0);
			if (sample[0] == 0){
				botonActivado = false;
				System.out.println("false false");
				
			    Delay.msDelay(0);
			}
				else{ 
					System.out.println("true true true");
					Delay.msDelay(0);
					botonActivado = true;
					//float [] muestras= new float[ojos.sampleSize()];
					
					
						//ojos.fetchSample(muestras, 0 );
						double distancia = 100;//en cm

						
						
						System.out.println("distancia:" + distancia);
						int grados = (int)57*360/17;
						motorA.rotate(grados,true);
						//motorC.rotate(grados);
				}	
			sp.fetchSample(muestras,0);
			float luz= muestras[0];
			if (luz<0.2)
			{
				avanzar();
				
			}
			else {
				defensa();
				
			}
			
		}
		}

	private void defensa() {
		motorA.rotate(800,true);
		motorC.rotate(800);
		giroCompleto();
		
		
		
	}
	private void avanzar() {
		motorA.backward();
		motorC.backward();
		
	}

	public void giroCompleto()
	{
		motorA.rotate(-1270,true);
		motorC.rotate(1270);
		
	}
	
		//public void dibujarPunto() {
		//	motorD.rotate(140);
			
 // }
	
}