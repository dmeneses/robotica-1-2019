import lejos.hardware.port.SensorPort;

public class ultrasonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UltraSonicSensor ojos = new UltraSonicSensor(SensorPort.S4);
		while (true) {
			float distancia = ojos.getRange();
			System.out.println(distancia);

		}
	}
}
