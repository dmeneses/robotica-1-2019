package myTest;



import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class avanzarBot2 {
	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
	
	
	/*motorB.setSpeed(500);
	motorB.forward();
	
	motorC.setSpeed(500);
	motorC.forward();
	
	Delay.msDelay(3600);*/
	
	/*motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	motorB.rotate(360);
	
	motorC.rotate(360);
	
	motorB.rotate(grados, true);
	motorC.rotate(grados);*/
	
	motorB.setSpeed(400);
	motorB.forward();
	motorC.setSpeed(400);
	motorC.forward();
	
	double distancia = 30;
	int grados = (int)distancia * 360 / 17;
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	int giro_derecha = 420;
	int giro_izquierda = 420;
	motorB.rotate(giro_derecha);
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	motorB.rotate(giro_derecha);
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	motorB.rotate(giro_derecha);
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	motorB.rotate(giro_derecha);
	motorC.rotate(giro_izquierda);
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	}
	
}

