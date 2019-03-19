import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
public class Carrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorA=new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorB=new EV3LargeRegulatedMotor(MotorPort.C);
		
		double distanciaAMover= 60;
		distanciaAMover=distanciaAMover/100;
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaAMover * circunferencia;
		grados=(int)(numeroDeRotaciones * 360);
				
		Button.waitForAnyPress();
		
		motorA.rotate(grados,true);
		motorB.rotate(grados,true);
		
		
		
	}

}
