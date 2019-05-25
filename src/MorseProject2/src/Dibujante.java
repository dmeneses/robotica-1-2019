
public class Dibujante {
	Auto auto;

	public Dibujante(Auto auto) {
		this.auto = auto;
	}

	public void dibujarCodigoMorse(String codigoMorse) {
		for (int cont = 0; cont < codigoMorse.length(); cont = cont + 1) {
			char signo = codigoMorse.charAt(cont);
			if (signo == '.') {
				auto.dibujarPunto();
			}
			if (signo == '-') {
				auto.dibujarLinea();
			}
			auto.AvanzarCm(2);
		}
	}
}
