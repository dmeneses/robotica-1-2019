package pruebasavanzar;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class PruebasAvanzar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EV3LargeRegulatedMotor motorDerecho = 
        		 new EV3LargeRegulatedMotor(MotorPort.A);
         EV3LargeRegulatedMotor motorIzquierdo =
        		 new EV3LargeRegulatedMotor(MotorPort.D);
         motorDerecho.forward();
         while(true){
        	motorDerecho.setSpeed(100);
        	motorIzquierdo.setSpeed(100);
        	motorIzquierdo.forward();
        	motorDerecho.forward();
        	Delay.msDelay(2000);
        	
        	
        	
         }
         
	}

}
