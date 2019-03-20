import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class TouchSensor {
	EV3TouchSensor sensor;
	SampleProvider sp;

	public TouchSensor(Port port) {
		sensor = new EV3TouchSensor(port);
		sp = sensor.getTouchMode();
	}


	public boolean isTouched() {
		float[] sample = new float[sp.sampleSize()];
		sp.fetchSample(sample, 0);
		if (sample[0] == 0)
			return false;
		else
			return true;
	}

	public void close() {
		sensor.close();
	}
}
