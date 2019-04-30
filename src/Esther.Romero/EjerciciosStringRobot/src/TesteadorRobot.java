import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class TesteadorRobot {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor lapiz = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3TouchSensor sensorTouchD =new EV3TouchSensor(SensorPort.S3);
		EV3TouchSensor sensorTouchI =new EV3TouchSensor(SensorPort.S2);
		SampleProvider muestrasCapturadasTouch = sensorTouchD.getTouchMode();
		SampleProvider muestrasCapturadasTouch1 = sensorTouchI.getTouchMode();
		
		

	}

}
