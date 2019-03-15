import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class MoverCarro {

	public static void main(String[] args) {
		int powerMotor= 70;
		int delayMilysegundos = 2000 ;
		//esta instruccion muestra el mensaje en pantalla
		System.out.println("Presione un boton para empezar.");
		
		//cambio el color de parpadeo de los lets
		Button.LEDPattern(4);
		Sound.beepSequenceUp();
		
		//espera hasta que presione un boton
		Button.waitForAnyPress();
		
		//avanzar hacia adelante: es necesario hablar con los motores
		  //declaramos la variable motorDerecho del tipo UnregulartedMotor
		//ASIGNAMOS  un motor nuevo a la variabk
	UnregulatedMotor motorDerecho = new UnregulatedMotor(MotorPort.A);
	UnregulatedMotor motorIzquierdo = new UnregulatedMotor(MotorPort.B);
	
	//encender motores: configuramos el poder de los motores
	motorDerecho.setPower(powerMotor);
	motorIzquierdo.setPower(70);
	
	//me duermo por 2 segundos  dejo de moverme  
	Delay.msDelay(2000);
	//para que no siga avanzando 
	motorDerecho.stop();
	motorIzquierdo.stop();
	
	//apago los motores
	motorDerecho.close();
	motorIzquierdo.close();
	
	Sound.beepSequenceUp();
	}
	
}
