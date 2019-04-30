import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;

	public class Telegrafo
	{
		float[] muestrasboton;
		EV3TouchSensor boton;
	
	public Telegrafo ()
	{
		boton = new EV3TouchSensor (SensorPort.S1);
		muestrasboton = new float [boton.sampleSize()];
	}
	
	
	public int detectarpulsador()
	{
		boton.fetchSample(muestrasboton, 0);
		
		return (int)muestrasboton[0];
		
	}
}
