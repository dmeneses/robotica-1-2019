import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class PruebaMotores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.D);
		
		while(true){
		motorDerecho.setSpeed(700);
		motorIzquierdo.setSpeed(700);
		motorDerecho.forward();
		motorIzquierdo.forward();
		Delay.msDelay(3000);
		motorDerecho.stop();
		motorIzquierdo.stop();
		}
		
	}

}

