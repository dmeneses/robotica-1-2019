import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class pruebaAvanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.C);
		
		motorA.setSpeed(500);
		motorA.forward();
		
		motorB.setSpeed(500);
		motorB.forward();
		
		Delay.msDelay(3000);
	}
		
	}
