import lejos.hardware.Button;
import lejos.hardware.port.MotorPort;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.utility.Delay;

public class pruebaabanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorB = new  EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
		
		/*motorB.setSpeed(200);
		motorB.forward();
		
		motorC.setSpeed(200);
		motorC.forward();
		
		Delay.msDelay(5000);
		
		motorB.stop();
		motorC.stop();
		motorC.setSpeed(500);
		motorB.setSpeed(500);*/
		
		//Button.waitForAnyPress();
		 
		double distancia = 30;
		int grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		/*motorB.close();
		motorC.close();*/
		
		
		
		
		
		
		
	}

}
