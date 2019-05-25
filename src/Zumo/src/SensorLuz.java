import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;


public class SensorLuz {
	
	public static void main(String[] args)
	{
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S4);
		SampleProvider luz = color.getRedMode(); //getAmbientMode()
		float[] muestras = new float[luz.sampleSize()];
		
		while(true)
		{
			luz.fetchSample(muestras, 0);
			float iluz = muestras[0];// valores entre 0 y 1, 0 total
		}
	}

}
