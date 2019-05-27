import lejos.hardware.Button;
import lejos.utility.Delay;


public class MainPelear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("esperando boton");
		Button.waitForAnyPress();
		Delay.msDelay(3000);
		Robot bender = new Robot();
		bender.giroCompleto();
		bender.pelear();

	}

}
