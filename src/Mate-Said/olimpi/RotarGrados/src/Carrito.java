import java.awt.Button;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class Carrito {
	 public static void main(String[]args){
	 
	EV3LargeRegulatedMotor motorA= new EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor (MotorPort.B);
	double distanciaAMoverme = 60;
	//distanciaAMoverme = distanciaAMoverme/100;
	
	int grados=0;
	double diametroRueda =5.5/100;
	double circunferencia =Math.PI*diametroRueda;
	
	
	double numeroDeRotaciones = distanciaAMoverme/circunferencia;
	grados = (int)(numeroDeRotaciones*360);
	
	Button.waitForAnyPress ();
	
	motorA.rotate(grados,true);
    motorB.rotate(grados,true);	
        }

}
