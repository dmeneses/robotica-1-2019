import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class SensorLuz {

	public static void main(String[] args) {
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S1);
		SensorUltrasonico ojos = new SensorUltrasonico(SensorPort.S4);
		SampleProvider luz = color.getRedMode(); // getAmbientMode()
		float[] muestras = new float[luz.sampleSize()];
		Auto Mulan = new Auto();
		while (true) {
			luz.fetchSample(muestras, 0);
			float iluz = muestras[0] * 100;// valores entre 0 y 1, 0 total

			if (iluz < 15) {
				System.out.println("OSCURIDAD .. AVANZAR!! " + iluz);
				Mulan.avanzar();

			} else {
				System.out.println("LUZ ... RETROCEDER!! " + iluz);
				Mulan.retrocedercm(25);
				Mulan.girar(270);
			}
			if (ojos.obtenerDistanciaEnCm() < 100) {
				System.out.println("ATACAR!!" + ojos);
				Mulan.atacar();
			} else {
				Mulan.girar(180);
			}
		}
	}

}
