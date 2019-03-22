package myTest;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;
    public class avanzarBot2 {
	
	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		

	/*motorB.rotate(Grades, true);
	motorC.rotate(Grades);
	Delay.msDelay(3600);
	motorB.rotate(360);
	motorC.rotate(360);
	motorB.rotate(Grades, true);
	motorC.rotate(Grades);*/
	
	motorB.setSpeed(400);
	motorB.forward();
	motorC.setSpeed(400);
	motorC.forward();
	Delay.msDelay(3600);
//	formula
	double distancia = 30;
	int grados = (int)distancia * 360 / 17;
	
	int giro_derecha = 420;
	int giro_izquierda = 420;
	
	int retro_derecha = 20;
	int retro_izquierda = 20;
	// prueba del cuadrado
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	motorB.rotate(giro_derecha);
	motorC.rotate(retro_izquierda);
	
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	motorB.rotate(giro_derecha);
	motorC.rotate(retro_izquierda);
	
	motorB.rotate(grados, true);
	motorC.rotate(grados);
	
	motorB.rotate(giro_derecha);
	motorC.rotate(retro_izquierda);
	
	motorB.rotate(giro_derecha);
	motorC.rotate(retro_izquierda);
	
    /*prueba del circulo*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

