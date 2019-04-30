import lejos.hardware.Button;


public class Hola {

	// este metodo dirigira lo que hara mi robot
	public static void main(String[] args) {
		// Mostrar Hola
		System.out.println("Hola!");
		
		// le decimos al robot que espere para
		// que yo presione alguno de sus botonos.
		Button.waitForAnyPress();

	}

}
