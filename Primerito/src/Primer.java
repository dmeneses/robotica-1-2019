import lejos.hardware.Button;
import lejos.hardware.motor.Motor;


public class Primer
{
	
	public static void main(String args[])
	{ 
		while (true)
		{
		System.out.println("Hola Girl Gang <3");
		
		int dis;
		dis = 24;
		//2pi*r//360/17.5*dis//
		double perimetro = 2*Math.PI*2.75; 
		double grados = 360/perimetro*dis;
		
		
		Motor.B.rotate((int)grados, true);
		Motor.C.rotate((int)grados);
		
		Button.waitForAnyPress();
		}
	}
}