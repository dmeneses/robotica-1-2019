import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class MoverCarro {

	public static void main(String[] args) {
		int powerMotor = 70;
		int delayMillisegundos = 2000; // 2 segundos
		
		// esta instruccion muestra este mensaje pantalla
		System.out.println("Presione un boton paara empezar..");
		
		// cambio el color de parpadeo de los leds
		Button.LEDPattern(4);
		Sound.beepSequenceUp();
		
		// espera hasta q yo presione algun boton
		Button.waitForAnyPress();
		
		// avanza hacia adelante: es necesario hablar con los motores
		
		// mirar a que puerto (letritas) esta conectado cada uno de mis motores
		// declaramos la variable motorDerecho del tipo UnregulatedMotor
		// = new UnregulatedMotor(MotorPort.A) --; 
		// 		ASIGNAMOS un motor nuevo a la variable motorDerecho
		UnregulatedMotor motorDerecho;
		motorDerecho = new UnregulatedMotor(MotorPort.A);
		UnregulatedMotor motorIzquierdo = new UnregulatedMotor(MotorPort.B);
		
		//  encender motores: configuramos el poder de los motores
		// el auto empiezA a moverese tan lento o rapido como yo quiera con cierta fuerza
		motorDerecho.setPower(powerMotor);
		motorIzquierdo.setPower(70);
		
		// me duermo por 2 segundos 00 dejo de moverme
		Delay.msDelay(delayMillisegundos);
		
		// para que no siga avanzanado
		motorDerecho.stop();
		motorIzquierdo.stop();
		
		// apago los motores
		motorDerecho.close();
		motorDerecho.close();
		
		Sound.beepSequenceUp();
	}

}
