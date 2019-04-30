import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class RegulatedMotors {

	public static void main(String[] args) {
		// 1. Declarar variables para manejar motores
		// Tipo de dato -- contenedora=caja=variable
		EV3LargeRegulatedMotor motorDerecho;
		EV3LargeRegulatedMotor motorIzquierdo;
		
		// 2. inicializar (dar un valor inicial) motores
		motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		
		
		// indicar al motor rotar 500 grados/segundo
		motorDerecho.setSpeed(500);
		motorDerecho.forward();
		
		// dormir por 3 segundos (voy a detener el carro por 3 segundos)
		Delay.msDelay(3000);
		
		
		
		// cuando pasen los 3 segundos...sigue avanzando
		// hasta q aprete un boton
		
		// O PUEDO decir stop para detener el movimiento
		// motorDerecho.stop();
		// motorIzquierdo.stop();
		
		Button.waitForAnyPress();
		
	}

}
