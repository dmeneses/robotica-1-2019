package morse;

public class Dibujante {

	Auto auto;

	public Dibujante(Auto auto) {
		this.auto = auto;
	}

	public void dibujarCodigoMorse(String codigoMorse) {
		String morse = codigoMorse;
		int tamaño = morse.length();
		for (int i = 0; i < tamaño; i = i + 1) {
			char v = morse.charAt(i);
			if (v == '-') {
				auto.dibujarLinea2(120);
				auto.avanzarCm(2);

			}
			if (v == '.') {
				auto.dibujarPunto2(120);
				auto.avanzarCm(2);
			}

		}
	}
}
