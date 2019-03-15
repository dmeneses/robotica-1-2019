import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class PruebasAvanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = 
				new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = 
				new EV3LargeRegulatedMotor(MotorPort.B);
		while(true) {
			motorDerecho.setSpeed(700);
			motorDerecho.forward();
			Delay.msDelay(3000);
			motorDerecho.stop();
		}

	}

}
