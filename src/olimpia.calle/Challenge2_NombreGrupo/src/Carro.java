import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
public class Carro {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S1);
	EV3UltrasonicSensor ultrasonic = new EV3UltrasonicSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motor1 = new EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motor2 = new EV3LargeRegulatedMotor(MotorPort.A);
	double diametroRueda = 5.5;
	public float dectectarColor() {
		float color = 0;
		// escribir codigo
		return color;
	}
	public double dectectarObstaculo() {
		double distancia = 0;
		// escribir codigo
		return distancia;
	}
	public void avanzar(double distancia) {
		// calcular angulo de giro usando *distancia*
		// usar motores para avanzar
	}
	public void girar(int gradoGiro) {
		// girar usando el valor de la variable *gradoGiro*		
	}
}
