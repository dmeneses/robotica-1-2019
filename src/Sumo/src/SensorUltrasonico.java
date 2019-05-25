import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class SensorUltrasonico 

{
	EV3UltrasonicSensor sensor;
	SampleProvider sp;
	float [] sample;
	
	public SensorUltrasonico(Port p)
	
	{
		sensor = new EV3UltrasonicSensor ( p);
		sp = sensor.getDistanceMode();
		sample = new float[sp.sampleSize()];
	}

	public float getRange()
	{
		sp.fetchSample(sample, 0);
		return sample[0];
	}

	public double obtenerDistanciaEnCm()
	{
		return getRange() * 100;
	}


}
