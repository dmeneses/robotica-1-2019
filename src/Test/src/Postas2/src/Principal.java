import lejos.hardware.motor.EV3LargeRegulatedMotor; 
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import  lejos.hardware.sensor.EV3ColorSensor; 
import lejos.utility.Delay;

public class Principal {	
	
	public static void main (String [] args){
			EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.B);
			EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.C);
		    GirodeEje goku = new GirodeEje(90);
			GirodeEje vegeta = new GirodeEje(90);
	}
	}