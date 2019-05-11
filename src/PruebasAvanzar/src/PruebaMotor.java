import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class PruebaMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorDerecho =
				new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = 
				new EV3LargeRegulatedMotor(MotorPort.B);
		while(true){
		motorDerecho.setSpeed(700);motorIzquierdo.setSpeed(700);
		motorDerecho.forward();motorIzquierdo.forward();
		Delay.msDelay(3000);
		motorIzquierdo.stop();motorDerecho.stop();
		}
	}

}
