import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class SensorColor {
	EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S1);
	float[]		sample;
	
	SensorColor()  {

		sensor.setFloodlight(false);
		sample = new float[sensor.sampleSize()];
	}
	
	int obtenerColor()	{
		sensor.fetchSample(sample, 0);
		return (int) sample[0];
	}

}
