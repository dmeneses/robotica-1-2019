import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;


public class EjemploSensorTouch {

	public static void main(String[] args) {
		TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
		
		while(true) {
			boolean estaPresionado = sensor1.isTouched();
			 System.out.println(estaPresionado);
		}
		// sensor1.close();
		// Button.waitForAnyPress();

	}

}
