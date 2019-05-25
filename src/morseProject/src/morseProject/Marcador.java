package morseProject;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Marcador {
	EV3MediumRegulatedMotor motor;

	public Marcador() {
		motor = new EV3MediumRegulatedMotor(MotorPort.D);

	}

	public void subirMarcador() {

	}

	public void bajarMarcador() {
		int angulo = 90;
		motor.rotate(angulo);

	}
}
