import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;
public class MoverCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//manejar variables
		int powerMotor;
		powerMotor = 70;
		//imprime el mensaje en el boton
		System.out.println("presione un boton para empezar...");
		//cambia el color de parpadeo
		 Button.LEDPattern(3);
		 Sound.beepSequence();
		 //espera hasta que yo presione un boton
		 Button.waitForAnyPress();
		 //avanza hacia adelante habalr con los
		 //declaramos la variable motor dercho del tipo unregulatedMotor
		 //asignamos un motor a la variable motor derecho
		  UnregulatedMotor motorDerecho ;
		  motorDerecho= new UnregulatedMotor(MotorPort.C);
		  UnregulatedMotor motorIzquierdo = new UnregulatedMotor(MotorPort.B);
		  motorDerecho.setPower(powerMotor);
		  motorIzquierdo.setPower(100);
		  Delay.msDelay(2000);
		  motorDerecho.stop();
		  motorIzquierdo.stop();
		  motorDerecho.close();
		  motorIzquierdo.close();
  
  
		  Sound.beepSequenceUp();
	}

}
