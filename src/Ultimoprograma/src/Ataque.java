import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;



public class Ataque {
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorC;
	EV3MediumRegulatedMotor motorD;
	
	

	
	public Ataque ()
	{
		motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	    motorC = new  EV3LargeRegulatedMotor(MotorPort.C);     
	    motorD = new EV3MediumRegulatedMotor(MotorPort.D);
	}
	
	public void atacar() {
		
		
        
		
	}

}
