package avanzarbot;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class PruebaAvanzar {
	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
	
	
	/*motorB.setSpeed(500);
	motorB.forward();
	
	motorC.setSpeed(500);
	motorC.forward();
	
	Delay.msDelay(3600);*/
	
	motorB.setSpeed(1000);
	motorC.setSpeed(1000);
	
	double distancia = 30;
	int grados = (int)distancia * 360 / 17;
	
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	}
	
}
