package primer;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;


public class primer {
	
	public static void main(String args[])
	{System.out.println("hello there");
	Motor.B.rotate(360,true);
	Motor.C.rotate(360);
	
	Button.waitForAnyPress();
	}


}
