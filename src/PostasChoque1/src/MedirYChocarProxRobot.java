import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class MedirYChocarProxRobot {
	
	public static void main(String[] args) {

		
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.D);
		TouchSensor sensor1 = new TouchSensor ( SensorPort.S1);
		SensorUltrasonico ojos = new SensorUltrasonico(SensorPort.S4);
		
		double distancia;
		double cm = ojos.getRange();
		boolean estaPresionado = sensor1.isTouched();
		distancia = ((360*cm)*(100))/(2*Math.PI*(2.8));
		
		
		
		while(true){
			estaPresionado = sensor1.isTouched();
			System.out.println(distancia);
		
			if(estaPresionado==true){
				motorDerecho.setSpeed(640);
				motorIzquierdo.setSpeed(640);
				motorDerecho.rotate((int) distancia, true);
				motorIzquierdo.rotate((int) distancia);
				
			}
			
			
		
		

		}
		
	}


	}


	


