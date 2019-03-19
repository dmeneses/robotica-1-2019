import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;
public class RegulatedMotors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipo de dato--contenedora=caja=variable
		EV3LargeRegulatedMotor motorDerecho;
		EV3LargeRegulatedMotor motorIzquierdo;
		
		motorDerecho=new EV3LargeRegulatedMotor(MotorPort.B);
		motorIzquierdo=new EV3LargeRegulatedMotor(MotorPort.C);
		
		motorDerecho.setSpeed(500);
		motorDerecho.forward();
		
		Delay.msDelay(3000);
		//motorDerecho.stop(); 
	//motorDerecho.stop();
		
		Button.waitForAnyPress();
		
		 
		 
		
	}

}
