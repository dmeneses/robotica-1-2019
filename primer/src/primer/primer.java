package primer;


import lejos.hardware.motor.Motor;


public class primer {
	
	public static void main(String args[])
	{System.out.println("hello there");
	int x; 
	x=40;      
	double grados ; grados=360*(x/(2.25*2*Math.PI));
	Motor.B.rotate((int)grados,true);
	Motor.C.rotate((int)grados );
	Ev3UltraSensor ojos;
	ojos=new Ev3ultrasonicSensor(SensorPart.S1); 
	
	
	
	}


}
