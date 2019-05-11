public class cadenas {

	int obtenerTamaño(String c) {
		int tamaño = c.length();
		return tamaño;
	}

	char obtenerCaracter(String a, int g) {
		char caracter = a.charAt(g);
		return caracter;
	}

	void obtenerC(String q) {

		for (int cont = 0; cont < q.length(); cont = cont + 1) {
			char f = q.charAt(cont);
			if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
				System.out.println(cont);
			}
		}

	}

	void mayuscula(String w) {
		String cadena = "";
		for (int con = 0; con < w.length(); con = con + 1) {
			char ñ = w.charAt(con);

			switch (ñ) {

			case 'o':
				cadena = cadena + 'O';

				break;

			case 'e':
				cadena = cadena + 'E';

				break;
			case 'i':
				cadena = cadena + 'I';

				break;
			case 'u':
				cadena = cadena + 'U';

				break;
			case 'a':
				cadena = cadena + 'A';

				break;
			default:
				cadena = cadena + ñ;

			}

		}
		System.out.println(cadena);
	}

	void posicionV(String h) {
		int cadena = 0;
		for (int con = 0; con < h.length(); con = con + 1) {
			char y = h.charAt(con);

			switch (y) {

			case 'o':
				cadena = cadena + 1;

				break;

			case 'e':
				cadena = cadena + 1;

				break;
			case 'i':
				cadena = cadena + 1;

				break;
			case 'u':
				cadena = cadena + 1;

				break;
			case 'a':
				cadena = cadena + 1;

				break;
			default:
				// cadena = cadena + y;

			}

		}
		// int resultado = 'o' + 'a' + 'u'+'e'+'i';
		System.out.println(cadena);
	}
}
