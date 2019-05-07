import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class SensorToque {

	public static void main(String[] args) {
		EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);
		
		SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();

		boolean sensorTouchDetectoToque = false;

		while (sensorTouchDetectoToque == false) {
			System.out.println("esperando a que pase algo");
			float[] datosDelSensor = new float[muestrasCapturadasTouch
					.sampleSize()];
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);

			if (datosDelSensor[0] == 0) {
				System.out.println("0 equivale a que no hubo toque");
			}
			if (datosDelSensor[0] != 0) {
				System.out.println(datosDelSensor[0]
						+ "equivale a que hubo toque");
				sensorTouchDetectoToque = true;
			}
		}
		System.out.println("Deje de espera");

        Button.waitForAnyPress();
	}

}
