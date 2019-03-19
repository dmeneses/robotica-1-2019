import lejos.hardware.Button;
import lejos.hardware.motor.Motor;


public class caffi2 
{
public static void main(String args[])	
{
		System.out.println("que salgan las variables!");
		double dis = 30; 
		double per;
		per=2*Math.PI*3;		
		double grados= 720*dis/per;
		Motor.B.rotate((int)-grados,true);
		Motor.C.rotate((int)- grados);
	    Button.waitForAnyPress();
}}