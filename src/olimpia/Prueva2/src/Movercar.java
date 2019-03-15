
public class Movercar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("presione un boton para empesar");
		//cambia el color de parpadeo 
		Button.LEDPattern(3);
		Sound.beepSequence();
		//espera asta q yo presione un boton
		Button.waitForAnyPress();
		UnregulatedMotor motorDerecho= new UnregulatedMotor(10) 
		
		
	}

}
