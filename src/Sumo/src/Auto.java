import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;

public class Auto {
	EV3LargeRegulatedMotor motorIzq = new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorDer = new EV3LargeRegulatedMotor(MotorPort.B);

	void avanzar() {
		motorDer.setSpeed(450);
		motorIzq.setSpeed(450);
		motorDer.forward();
		motorIzq.forward();

	}

	void girar(int angulo) {
		double perimetro = ((2 * Math.PI * 5.82));
		double girarcm = perimetro * angulo / 360;

		double perimetro2 = (2 * Math.PI * 2.8);
		double gradosGirar = girarcm * 360 / perimetro2;
		motorDer.rotate((int) gradosGirar, true);
		motorIzq.rotate((int) ((-1) * gradosGirar));
	}

	void retrocedercm(int cm) {
		double distancia = 2 * Math.PI * 2.8;
		motorDer.rotate((int) ((int) (-1) * distancia), true);
		motorIzq.rotate((int) ((int) (-1) * distancia));
	}

	void atacar() {
		motorDer.setSpeed(650);
		motorIzq.setSpeed(650);
		motorDer.forward();
		motorIzq.forward();
	}
	
	public void atacarAtras() {
		motorDer.setSpeed(650);
		motorIzq.setSpeed(650);
		motorDer.backward();
		motorIzq.backward();
	}
}
