import lejos.hardware.Button;
import lejos.hardware.motor.Motor;


public class Imagine1 
{
     public static void main(String args[])
  {
    	 int dis;
	     dis=30;
	 int grad;
	 grad = dis * 36;  
		  
    	 Motor.B.setSpeed(400);
    	 Motor.C.setSpeed(400);
    	 Motor.B.rotate(grad,true);
    	 Motor.C.rotate(grad);
    	 Motor.C.rotate(720);
    	 Motor.B.rotate(grad,true);
    	 Motor.C.rotate(grad);
    	 
    	 System.out.println("hola mundo");
    	 
    	 Button.waitForAnyPress();
    	    
    	 
   	 
  }
 }
