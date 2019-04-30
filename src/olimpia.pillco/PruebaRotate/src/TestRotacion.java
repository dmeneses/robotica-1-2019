import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class TestRotacion {

	public static void main(String[] args) {
		// declaro contenedora e inicializo(le doy un valor inicial) motorores
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		
		// Hacer que los motores roten 360 grados. UNO despues de otro
		Button.waitForAnyPress();
		motorDerecho.rotate(360);
		motorIzquierdo.rotate(360);
		
		Button.waitForAnyPress();
		// Hacer que los motores roten 360 grados. Los dos al mismo tiempo
		motorDerecho.rotate(360, true);
		motorIzquierdo.rotate(360, true);

		Button.waitForAnyPress();
		motorDerecho.rotate(170, true);
		motorIzquierdo.rotate(170, true);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(-170, true);
		motorIzquierdo.rotate(-170, true);

		// apaga motores
		motorDerecho.close();
		motorIzquierdo.close();

	}

}
