import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.port.MotorPort;




public class Rotar {
	public static void main(String[] args) {
		
		int cm=10;
		int formula=(int) ((360*cm)/(2*Math.PI*2.8));
	EV3LargeRegulatedMotor motorDerecho =
			new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorIzquierdo = 
			new EV3LargeRegulatedMotor(MotorPort.B);
	TouchSensor sensor1 = new TouchSensor(SensorPort.S3);

	boolean estaPresionado = sensor1.isTouched();
	System.out.println(estaPresionado);
	while (estaPresionado == false) {
		estaPresionado = sensor1.isTouched();

		if (estaPresionado == true) {
			motorDerecho.rotate(formula,true);
			 motorIzquierdo.rotate(formula);
			// Delay.msDelay();

		} else {
			motorIzquierdo.stop();
			motorDerecho.stop();
			
		}
		
	}
	
	 
	 
	
	}

}
