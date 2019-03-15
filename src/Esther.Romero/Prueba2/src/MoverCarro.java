import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class MoverCarro {

	public static void main(String[] args) {
		System.out.println("Presione un boton para empezar..");
		Button.LEDPattern(2);
		Sound.beepSequenceUp();
		Sound.beepSequence();
		Button.waitForAnyPress();
		UnregulatedMotor motorDerecho = new UnregulatedMotor(MotorPort.C);
		UnregulatedMotor motorIzquierdo = new UnregulatedMotor(MotorPort.B);
		
		motorDerecho.setPower(100);
		motorIzquierdo.setPower(-100);
		
		Delay.msDelay(2000);
		
		motorDerecho.stop();
		motorIzquierdo.stop();
		
		motorDerecho.close();
		motorIzquierdo.stop();
		
	}

}
