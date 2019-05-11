import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class sensor_color_ {
	EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S3);
	float[] sample;

	sensor_color_() {
	
		sensor.setFloodlight(false);
		sample = new float[sensor.sampleSize()];

	}

	int obtenerColor(){
		
		sensor.fetchSample(sample, 0);
		return (int) sample[0];
		
		
	}
		

}
