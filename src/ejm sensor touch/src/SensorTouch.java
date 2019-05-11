import lejos.hardware.Button;
import lejos.hardware.port.Port;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;
import lejos.hardware.motor.EV3LargeRegulatedMotor;

public class SensorTouch {

	public static void main(String[] args) {

		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(
				MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(
				MotorPort.B);

		TouchSensor sensor1 = new TouchSensor(SensorPort.S3);
		boolean estaPresionado = sensor1.isTouched();
		System.out.println(estaPresionado);
		// Button.waitForAnyPress();
		while (estaPresionado == false) {
			estaPresionado = sensor1.isTouched();

			if (estaPresionado == false) {
				motorDerecho.setSpeed(700);
				motorIzquierdo.setSpeed(700);
				motorDerecho.forward();
				motorIzquierdo.forward();
				// Delay.msDelay();

			} else {
				motorIzquierdo.stop();
				motorDerecho.stop();
				//sensor1.close();
			}
			// sensor1.close();
		}
	}
}
