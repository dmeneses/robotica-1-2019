import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class RegulatedMotors {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho;
		EV3LargeRegulatedMotor motorIzquierdo; 
		
		motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
		motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
		
		motorDerecho.setSpeed(50000);
		motorDerecho.forward();
		
		motorIzquierdo.setSpeed(50000);
		motorIzquierdo.forward();
		
		Delay.msDelay(3000);
		
		Button.waitForAnyPress();
		
		Sound.beepSequence();
		Sound.beepSequenceUp();
		Sound.beepSequence();

	}
}
