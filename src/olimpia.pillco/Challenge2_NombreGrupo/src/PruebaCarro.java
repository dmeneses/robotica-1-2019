public class PruebaCarro {
	public static void main(String[] args) {
		int[] gradosRojo = {20, -90, 70};
		int[] gradosAzul = {70, -100, 30};
		int[] gradosVerde = {-50, 120, -70};
		double distanciaFijaRecorrido  = 30; // centimetros 
		Carro carroNuevo = new Carro();
		// 1. Detectar color
		boolean detecteColor = false;
		float colorDetectado = 0;
		while(detecteColor == false){			
			colorDetectado = carroNuevo.dectectarColor();
			detecteColor = true;
		}
		// 2. Evaluar(Preguntar) que arreglo de grados, gradosRojo O gradosAzul
		// O gradosVerde se va a usar
		// 3. Girar & avanzar distanciaFijaRecorrido
		// 4. Detectar siguiente carro, avanzar lo suficiente??
		boolean detecteSiguiente = false;
		double distanciaDetactada = 0;
		while(detecteSiguiente == false){			
			distanciaDetactada = carroNuevo.dectectarObstaculo();
			detecteSiguiente = true;
		}
	}

}
