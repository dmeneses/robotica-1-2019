public class PruebaCarro {

	public static void main(String[] args) {
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		int[] gradosRojo = { 20, -90, 70 };
		int[] gradosAzul = { 70, -100, 30 };
		int[] gradosVerde = { -50, 120, -70 };
		double distanciaFijaRecorrido = 30;// centimetros

		Carro carritoSara = new Carro();
		boolean detecteColor = false;
		float colorDetectado = 0;
		while (detecteColor == false) {

			colorDetectado = carritoSara.detectarColor();
			if (colorDetectado == colorRojo

			|| colorDetectado != colorRojo 
			|| colorDetectado != colorVerde
			|| colorDetectado != colorAzul) {
			colorDetectado = carritoSara.detectarColor();
			detecteColor = true;

			}
			double distanciaAvance = 30;
			if (colorDetectado == colorRojo) {
				carritoSara.avanzar(distanciaAvance);
				}
			else if(colorDetectado==colorAzul)
			{
				
			}
			distanciaAvance = 30;
			if (colorDetectado == colorAzul) {
				carritoSara.avanzar(distanciaAvance);
			}
			else if (colorDetectado==colorVerde){
				
			}
			distanciaAvance = 30;
			if (colorDetectado == colorVerde) {
				carritoSara.avanzar(distanciaAvance);
			}
			 
			for (int piso = 0; piso < 3; piso = piso + 1) {
				int grado = gradosAzul[piso];
				carritoSara.girar(grado);
				carritoSara.avanzar(distanciaAvance);

			}
			double distanciaAvance1 = 30;
			if (colorDetectado == colorRojo) {
				carritoSara.avanzar(distanciaAvance1);
			}
			
			boolean detecteSiguiente = false;
			double distanciaDetectada = 0;
			while (detecteSiguiente == false)
				distanciaDetectada = carritoSara.detectarObstaculo();
				detecteSiguiente = true;
			carritoSara.detectarObstaculo();
			}               
		 
		 
	}

}
