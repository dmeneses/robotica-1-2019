import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

// el carrito tiene dos motores
public class Carrito {
	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor (MotorPort.B);
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor (MotorPort.C);
		
        // quiero moverme 60 centimetros
		// la contendora(distancia) tiene el valor de 60 (cm)
		// usando el rotate...quiero moverme esa distancia
		// grados en 0 porque no se cuando grados girar para 60 cm todavia
		
		// CALCULAR cuantos grados pasarle al rotate
		double distanciaAMoverme = 60; // DATO --> en centimetros
		// los grados que lo voy a pasar al rotate
		int grados = 0; // incognita
		double diametroRueda = 5.5; // DATO: de gomita a gomita en centimetros
		double circunferencia = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaAMoverme / circunferencia;
		grados = (int)(numeroDeRotaciones * 360);
		
		// moverme 60 centimetros
		int velocidad = 500;
		motorA.setSpeed(velocidad); // motor dar 500 vueltas por segundo
		motorA.rotate(grados, true);
		motorB.setSpeed(velocidad);
		motorB.rotate(grados);
	}
}
