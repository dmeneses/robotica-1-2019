package sensoresojos;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Sensoresojos {

	public static void main(String[] args) 
	{
		EV3UltrasonicSensor ojos = new EV3UltrasonicSensor(SensorPort.S3);
		float[]muestras=new float[ojos.sampleSize()];
		while(true)
		{
		// TODO Auto-generated method stub
		
		ojos.fetchSample(muestras,0);
		System.out.println("distancia"+muestras[0]);
		}
	}

}
