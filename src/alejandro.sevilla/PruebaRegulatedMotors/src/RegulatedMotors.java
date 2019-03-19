import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class RegulatedMotors {

	public static void main(String[] args) {
		//tipo de dato--contenedora o variable
		EV3LargeRegulatedMotor motorDerecho;
		EV3LargeRegulatedMotor motorIzquierdo;
		//inicializar (dar un valor inicial)motores
		motorDerecho = new EV3LargeRegulatedMotor(MotorPort.C);
		motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		//indicar al motor rotar 500 grados7segundo
		motorDerecho.setSpeed(4000);
		motorDerecho.forward();
		//dormir por tres segundos
		Delay.msDelay(2000);
		//o puedo decir motor dercho
		motorDerecho.stop();
		motorIzquierdo.stop();
		Button.waitForAnyEvent();
		

	}

}
