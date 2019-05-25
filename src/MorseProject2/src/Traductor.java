import java.util.Scanner;

public class Traductor {

	// String[] codigoMorse = {".-", "."};

	String traducirCodigoATexto(String codigoMorse) {
		String vacio = " ";

		switch (codigoMorse) {
		case ".-": {
			vacio = vacio + "A";
		}
			break;
		case ".": {
			vacio = vacio + "E";
		}
			break;
		case "..": {
			vacio = vacio + "I";
		}
			break;
		case "---": {
			vacio = vacio + "O";
		}
			break;
		case "..-": {
			vacio = vacio + "U";
		}
			break;
		case "...": {
			vacio = vacio + "S";
		}
			break;
		default: {
			vacio = vacio + codigoMorse;
		}
			break;
		}
		return vacio;
	}
}
