import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;

public class Principal {

	public static void main(String args[]) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		
		Pulsador pulsador = new Pulsador(SensorPort.S2);
		SensorUltrasonico ojos = new SensorUltrasonico(SensorPort.S4);
		
		// Logica de postas
		int gradosGiro;
		boolean presionado;
		
		while(true) {
			//Logica de esperar y avanzar
		}
	}
}
