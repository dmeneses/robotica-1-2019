import lejos.hardware.Button;

public class PruebaRobot {

	public static void main(String[] args) {
		Robot robot = new Robot();
		pulsadoresMorse morseP = new pulsadoresMorse();
		Morse traductor = new Morse();
		boolean terminarcodigo = false;
		char [] codigoEnMorse = new char [100];
		int contadorCaracter = 0;
        
		while (terminarcodigo == false) {
			
			char caracter = morseP.pulsadorMorse();
			terminarcodigo = robot.terminarya();
			System.out.println("terminarcodigo=" + terminarcodigo);
			codigoEnMorse[contadorCaracter] = caracter;
			contadorCaracter = contadorCaracter + 2;

		}
		
		
		for(int i=0; i < codigoEnMorse.length; i++){
			
		}
		 
		String codigoCadena = new String(codigoEnMorse);
		System.out.println("el codigo es = " + codigoCadena);
		
		Button.waitForAnyPress();
		int numerodetramos= codigoEnMorse.length;
		int gradoslapizarriba= 140;
		int gradoslapizabajo=(-1)*140;
		int distaciaraya= 4;
		if(codigoEnMorse[i]=="."){
			
		}
		//String traducido= traductor.convertirAMorse(codigoEnMorse);
		
		
			
		/*System.out.println("termine de ingresar codigo Morse");
		for (int i = 0; i < codigoEnMorse.length; i = i + 1) {
			String enEspaniol = traductor.convertirAMorse();
		}

		/*
		 * robot.dibujarMorse(codigoEnMorse); Button.waitForAnyPress();
		 */
	}
}