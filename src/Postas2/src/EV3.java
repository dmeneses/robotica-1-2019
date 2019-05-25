import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class EV3 {

	EV3LargeRegulatedMotor motorIzq = new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorDer = new EV3LargeRegulatedMotor(MotorPort.B);
	SensorUltrasonico ojos = new SensorUltrasonico(SensorPort.S4);
	SensorColor color = new SensorColor();

	void avanzarcm(int cm) {

		double distancia = 2 * Math.PI * 2.8;

		motorDer.rotate((int) (360 * cm / distancia), true);
		motorIzq.rotate((int) (360 * cm / distancia));
	}

	void girarDer(int grados) {

		double perimetroA = ((2 * Math.PI * 13.2));
		double girarcm = perimetroA * grados / 360;

		double perimetro = (2 * Math.PI * 2.8);
		double gradosGirar = girarcm * 360 / perimetro;
		motorDer.rotate((int) (gradosGirar));

	}

	int obtenerColor() {
		return color.obtenerColor();
	}

	float getRange() {
		return ojos.getRange();
	}
	void centro(float angulo){

		double perimetro = ((2 * Math.PI * 5.82));
		double girarcm = perimetro * angulo / 360;

		double perimetro2 = (2 * Math.PI * 2.8);
		double gradosGirar = girarcm * 360 / perimetro2;
		motorDer.rotate((int) ((gradosGirar)),true);
		motorIzq.rotate((int) ((-1)*gradosGirar));

		
	}
	}


