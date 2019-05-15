import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;


public class Defensa {
	EV3TouchSensor delantero;
	EV3TouchSensor trasero;
	EV3ColorSensor sensor; 
	
	public Defensa ()
	{   
		sensor = new EV3ColorSensor(SensorPort.S2);
	    delantero = new  EV3TouchSensor(SensorPort.S3);
	    trasero = new  EV3TouchSensor(SensorPort.S1); 
	    
	}

}
