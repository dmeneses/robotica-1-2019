package morseProject;

public class Principal {
	public static void main(String[]args){
		/*Auto auto = new Auto();
		Dibujante dibujante = new Dibujante(auto);
		
		String codigoMorse="_ _";
		
		dibujante.dibujarCodigoMorse(codigoMorse);
		*/
		
		Marcador marcador = new Marcador();
		marcador.bajarMarcador();
		
		Auto auto = new Auto();
		auto.dibujarLinea();
		auto.dibujarPunto();
	}

}
