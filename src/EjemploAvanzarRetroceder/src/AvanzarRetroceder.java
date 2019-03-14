

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class AvanzarRetroceder {

	public static void main(String[] args) {
		Button.LEDPattern(4);    // flash green led and
        Sound.beepSequenceUp();    // make sound when ready.

        Button.waitForAnyPress();
        
        EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
        EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
        
        // set motors to 500 degrees/second rotation.
        //motorA.setAcceleration(500);
        motorA.setSpeed(500);
        motorA.forward();    // starts rotation.

        //motorA.setAcceleration(500);
        motorB.setSpeed(500);
        motorB.forward();    // starts rotation.
        
        // wait 3 seconds.
        Delay.msDelay(5000);

        // stop motors with brakes on.
        motorA.stop();
        motorB.stop();
        
        Sound.beepSequenceUp();
        Button.waitForAnyPress();
	}

}
