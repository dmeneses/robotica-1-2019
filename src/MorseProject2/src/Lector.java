import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Lector {
	TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
	TouchSensor sensor2 = new TouchSensor(SensorPort.S2);

	String Leer() {

		boolean estaPresionado = sensor1.isTouched();
		boolean noEstaPresionado = sensor2.isTouched();
		String vacio = "";
		while (noEstaPresionado == false) {
			estaPresionado = sensor1.isTouched();
			noEstaPresionado = sensor2.isTouched();
			if (estaPresionado == true) {
				vacio = vacio + ".";
			}
			if (estaPresionado == true) {
				noEstaPresionado= estaPresionado;
			}
		}
		return vacio;

	}
}
