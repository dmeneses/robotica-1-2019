import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Carro {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S2);
	EV3UltrasonicSensor ultrasonico = new EV3UltrasonicSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	double diametroRueda = 5.5;
	
	public float dectectarColor() {
		float color = 0;
		// detectar color y entregar el color con return
		return color;
	}
	
	public float dectectarObstaculo() {
		float distancia = 0;
		// detectar distancia y entregar la distancia con return
		return distancia;
	}
	
	public void avanzar(double distancia) {
		// calcular angulo de giro
		// usar motores para avanzar
	}
	
	public void girar(int angulo) {
		// usar motores para girar
		
	}
	
	public void apagarMotores(){
		motorA.close();
		motorB.close();
	}
	
	public void apagarSensores(){
		sensorColor.close();
		ultrasonico.close();
	}
}
