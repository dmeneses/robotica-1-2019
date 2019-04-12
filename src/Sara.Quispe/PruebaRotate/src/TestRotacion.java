import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class TestRotacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorDerecho=new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorIzquierdo=new EV3LargeRegulatedMotor(MotorPort.C);
		
		motorDerecho.rotate(360);
		motorIzquierdo.rotate(360);
		
		motorDerecho.rotate(360,true);
		motorIzquierdo.rotate(360,true);
		
		motorDerecho.rotate(360,true);
		motorIzquierdo.rotate(360,true);
		
		motorDerecho.close();
		motorIzquierdo.close();
		
		 

	}

}