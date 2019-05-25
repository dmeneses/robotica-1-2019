import lejos.hardware.Button;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3TouchSensor;

public class EjemploSensorTouch {

	public static void main(String[] args) {
		
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.D);
	
			
		TouchSensor sensor1 = new TouchSensor ( SensorPort.S1);
		boolean estaPresionado = sensor1.isTouched();
		System.out.println(estaPresionado);
		//sensor1.close();
		//Button.waitForAnyPress();
		
		int contador = 0;
		
    
	
		while(contador < 3){ 
			
			estaPresionado = sensor1.isTouched();
			if (estaPresionado==true){
				motorDerecho.stop();
				motorIzquierdo.stop();		
				
				contador = contador+1;
			}
			else{
				motorDerecho.setSpeed(700);
				motorIzquierdo.setSpeed(700);
				motorDerecho.forward();
				motorIzquierdo.forward();
				//sensor1.close();
				
			}	
			
		}


	}
}
