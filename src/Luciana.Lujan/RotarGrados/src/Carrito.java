import lejos.hardware.Button;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

// el carrito tiene dos motores
public class Carrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor  motorDerecho= new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor  motorIzquierdo= new EV3LargeRegulatedMotor(MotorPort.C);
		
		// quiero moverme 60 cm
		// la contenedora (distancia) tiene el valor de 60 cm
		double distanciaAMoverme = 60;
		//distanciaAMoverme = distanciaAMoverme;
		
		// usando el rotate..quiero moverme esa disancia
		
		// grados en 0 porque no se cuando grados girar para 600 cm todavia 
		int grados =0;
        double diametroRueda = 5.5; // de gomita a gomita en centimetros 
		double circunferencia = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaAMoverme/circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		System.out.println(grados);
		
		// moverme 60 cm
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		// mover 60 cm
		Delay.msDelay(1000);
		
		motorDerecho.rotate(360);
		motorDerecho.setSpeed(500);
		motorIzquierdo.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.rotate(grados);
		
		//
		Delay.msDelay(1000);
		
		motorDerecho.rotate(360);
		motorDerecho.setSpeed(500);
		motorIzquierdo.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.rotate(grados);
		
		//
        Delay.msDelay(1000);
		
		motorDerecho.rotate(360);
		motorDerecho.setSpeed(500);
		motorIzquierdo.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.rotate(grados);
		
	}

}