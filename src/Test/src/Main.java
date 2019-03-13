import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class Main {

	public static void main(String[] args) {
		//LCD.drawString("Plugin Test", 0, 4);
		//Delay.msDelay(5000);
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
        EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
        
        motorA.setSpeed(500);
        motorA.forward();    // starts rotation.

        //motorA.setAcceleration(500);
        motorB.setSpeed(500);
        motorB.forward();    // starts rotation.
        
     // wait 3 seconds.
        Delay.msDelay(3000);

	}

}

