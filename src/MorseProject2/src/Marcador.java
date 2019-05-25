

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Marcador {
	EV3MediumRegulatedMotor motor;

	public Marcador() {
		motor = new EV3MediumRegulatedMotor(MotorPort.A);

	}

	public void subirMarcador() {

		int angulo = 90;
		motor.rotate(angulo);
	}

	public void bajarMarcador() {
		int angulo = -90;
		motor.rotate(angulo);

	}
}
