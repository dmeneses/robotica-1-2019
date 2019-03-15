import lejos.hardware.port.MotorPort;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.utility.Delay;

public class pruebaabanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorB = new  EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
		
		motorB.setSpeed(600);
		motorB.forward();
		
		motorC.setSpeed(300);
		motorC.forward();
		
		motorB.setSpeed(600);
		motorB.forward();
		
		motorC.setSpeed(300);
		motorC.forward();
		
		Delay.msDelay(300000);
		
	}

}
