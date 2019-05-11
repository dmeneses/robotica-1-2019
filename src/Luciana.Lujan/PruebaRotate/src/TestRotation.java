import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort; 


public class TestRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaro contenedora e inicializo(le doy un valor inical) motores
		EV3LargeRegulatedMotor  motorDerecho= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor  motorIzquierdo= new EV3LargeRegulatedMotor(MotorPort.C);
		
		motorDerecho.rotate(360);
		motorIzquierdo.rotate(360);
		

		Button.waitForAnyPress();
		
		// Hacer que los motores roten 360 grados. los dos al mismo tiempo 
		Sound.beepSequenceUp();
		motorDerecho.rotate(360,true);
		motorIzquierdo.rotate(360,true);
		
		
		Button.waitForAnyPress();
		motorDerecho.rotate(170,true);
		motorIzquierdo.rotate(-170,true);
		
		// apaga motores 
		motorDerecho.close();
		motorIzquierdo.close();
	
	
	}

}
