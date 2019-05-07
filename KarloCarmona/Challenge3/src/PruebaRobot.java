
public class PruebaRobot {

	public static void main(String[] args) {
		Robot robot = new Robot();
		bool terminarCodigo = false;
		char [] codigoEnMorse = new char [200];
		int contadorCaracter = 0;
		while (terminarCodigo == false){
			terminarCodigo = robot.pedir.DatosAlPulsadorTerminar();
			System.out.println("terminarCodigo ="+ terminarCodigo);
			char caracter = robot.pedirDatosAlPulsadorCodigo();
			System.out.println("caracter="+ caracter);
			codigoEnMorse[contadorCaracter]= caracter;
			contadorCaracter = contadorCaracter +1;
			
		}
 
	}

}
