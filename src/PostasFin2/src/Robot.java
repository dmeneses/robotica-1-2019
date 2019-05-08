import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;


public class Robot {
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorD;
	EV3TouchSensor sensorCodigo;
	EV3TouchSensor sensorTerminar;
	
	public Robot(){
		 
		 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	     motorD = new  EV3LargeRegulatedMotor(MotorPort.D);     
	     sensorCodigo = new  EV3TouchSensor(SensorPort.S1);
	     sensorTerminar = new  EV3TouchSensor(SensorPort.S2);
	      
	}
	public void dibujarPunto() {
		// TODO Auto-generated method stub
		
	}

	public void dibujarGuion(int avanzar) {
		// TODO Auto-generated method stub
		
	}

}
