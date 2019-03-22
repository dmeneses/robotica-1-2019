import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
public class Carrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorB=new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC=new EV3LargeRegulatedMotor(MotorPort.C);
		
		double distanciaAMover=120;
		//distanciaAMover=distanciaAMover;
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaAMover/circunferencia;
		grados=(int)(numeroDeRotaciones* 360);
		System.out.println("grados"+ grados);
		
		int velocidad=500;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorC.setSpeed(velocidad);
		motorC.rotate(grados);
		
		
		motorC.rotate(380);
		
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorC.setSpeed(velocidad);
		motorC.rotate(grados);
		
		motorC.rotate(380);
		
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorC.setSpeed(velocidad);
		motorC.rotate(grados);
		
		motorC.rotate(380);
		
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorC.setSpeed(velocidad);
		motorC.rotate(grados);
		
		motorB.stop();
		motorC.stop();
		
		motorB.close();
		motorC.close();
		
		}

}
