package ejemploultrasonico;

import java.math.*;
import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;

public class PruebaCm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
		 
		  boolean estaPresionado = sensor1.isTouched();
		  
		  System.out.println(estaPresionado);
		EV3LargeRegulatedMotor motorDerecho = 
	       		 new EV3LargeRegulatedMotor(MotorPort.A);
	        EV3LargeRegulatedMotor motorIzquierdo =
	       		 new EV3LargeRegulatedMotor(MotorPort.D);
	while(true){
	 int cm = 30;
	 double perimetro = 2* Math.PI *2.8;
	 estaPresionado =  sensor1.isTouched();   	
			if(estaPresionado == true){
				
			motorDerecho.rotate((int) (360*cm/perimetro),true);
	        motorIzquierdo.rotate((int) (360*cm/perimetro));
	        
			}		
	}
	 

                                                                                                                             
	}

}
