import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.RangeFinder;
import lejos.robotics.SampleProvider;
public class CarroUltrasonico {
	public static void main(String[] args){
		// declarar una variable ojitos
		// del tipo de dato UltraSonicSensor
		EV3UltrasonicSensor ojitos = 
				new EV3UltrasonicSensor(SensorPort.S1);
		System.out.println("esperando a que presione cualquier boton");
		Button.waitForAnyPress();
		Sound.beepSequenceUp();
		// sensor ojitos preparare para mandarme datos
		SampleProvider muestrasCapturadasOjitos;
		muestrasCapturadasOjitos = ojitos.getDistanceMode();
		
		float distanciaAlObstaculo = 0;
		// capturar datos mientras que la distancia al obstanculo
		// sea 0
		while(distanciaAlObstaculo != Float.POSITIVE_INFINITY){
			float[] datosOjitos = 
					new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);		
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor =" 
					+ distanciaAlObstaculo);
			
			
			//  distanciaAlObstaculo = Float.POSITIVE_INFINITY;
		}
		ojitos.close();
		Sound.beepSequence();
		Button.waitForAnyPress();
	}
}
