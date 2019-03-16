package afedo2;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;

public class alfred
{

public static void main(String args[])
{ 
	System.out.println("Hola mundo¡");
	Button.waitForAnyPress();
	Motor.B.rotate(3000,true);
	Motor.C.rotate(3000);
	Motor.A.rotate(90);
	Motor.A.rotate(90);
	Button.waitForAnyPress();
} 
}

