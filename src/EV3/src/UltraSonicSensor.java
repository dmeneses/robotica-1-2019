import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.RangeFinder;
import lejos.robotics.SampleProvider;


public class UltraSonicSensor 
{
	EV3UltrasonicSensor sensor;
	SampleProvider sp;
	float [] sample;

	public UltraSonicSensor(Port port)
	{
		sensor = new EV3UltrasonicSensor(port);
		sp = sensor.getDistanceMode();
		sample = new float[sp.sampleSize()];
	}
	
	public float getRange()
	{
		sp.fetchSample(sample, 0);
		return sample[0];
		
	}
	

}
