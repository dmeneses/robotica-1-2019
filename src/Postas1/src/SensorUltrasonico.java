import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class SensorUltrasonico
{
	EV3UltrasonicSensor sensor;

	public SensorUltrasonico(Port port)
	{
		sensor = new EV3UltrasonicSensor(port);
		
	}

	public float obtenerDistancia()
	{
		SampleProvider sp = sensor.getDistanceMode();
    	float[] sample = new float[sp.sampleSize()];
       	sp.fetchSample(sample, 0);
       	return sample[0];
	}

	public void cerrar()
	{
		sensor.close();
	}
}
