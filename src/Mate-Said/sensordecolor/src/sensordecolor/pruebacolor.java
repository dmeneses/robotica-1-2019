package sensordecolor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class pruebacolor {
	
	EV3ColorSensor sensor = new  EV3ColorSensor(SensorPort.S2);
	   
	    public int getColorID(float[] sample)
		{
			sensor.fetchSample(sample, 0);
			
			return (int) sample[0];
		}	   
	}


