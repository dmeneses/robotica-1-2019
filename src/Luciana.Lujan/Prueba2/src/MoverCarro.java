import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class MoverCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Presione un boton para empezar..");
		
		// cambio el color de parpadeo de los leds
		Button.LEDPattern(4);
		Sound.beepSequenceUp();
		
		//espera hasta que yo presione un boton
		Button.waitForAnyPress();
		
		// avanza hacia adelante: es necesario hablar con los motores
		
		// mirar a un puerto(letritas)esta conectado auno de mis motores
		// declaramos la variable motorDerecho del tipo UnregulatedMotor
		//
		UnregulatedMotor motorDerecho;
		motorDerecho = new UnregulatedMotor(MotorPort.C);
		UnregulatedMotor motorIzquierdo= new UnregulatedMotor(MotorPort.B);
		
		//encender motores:configuramos el poder de los motores
		//el aunto empieza a moverse tan lento o rapido ciom yo quiera con cierta fuerza
		motorDerecho.setPower(5000);
		motorIzquierdo.setPower(-3000);
		
		// me duermo por 2 segundos 00 dejo de moverme
		Delay.msDelay(2000);
		
		// 
		motorDerecho.stop();
		motorIzquierdo.stop();
		
		//apago de los motores 
		motorDerecho.close();
		motorIzquierdo.close();
		
		Sound.beepSequenceUp();
		


	}

}
