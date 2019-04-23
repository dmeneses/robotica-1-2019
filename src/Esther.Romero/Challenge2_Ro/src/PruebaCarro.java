
public class PruebaCarro {

	public static void main(String[] args) {
		int[] gradosRojo = {80, -270, 280};
		int[] gradosAzul ={70, -100, 30};
		int[] gradosVerde ={-50, 120, -70};
		double distanciaFijaRecorrida = 30;
		
		Carro carroNuevo = new Carro();
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		boolean detecteColor = false;
		float colorDetectado = -1;
		
		while(detecteColor == false){
			colorDetectado = carroNuevo.detectarColor();

			if(colorDetectado == colorRojo
					|| colorDetectado == colorAzul
					|| colorDetectado == colorVerde){
				System.out.println("detectamos color Valido!!" + colorDetectado);
			detecteColor = true;
		}
		
		boolean detecteSiguiente = false;
		double distanciaDetectada = 0;
		while(detecteSiguiente == false){
			distanciaDetectada = carroNuevo.detectarObstaculo();
			detecteSiguiente = true;
		}
		
		if (colorDetectado == colorAzul){ 
			for(int piso = 0; piso < 3; piso = piso +1){
				int grado = gradosAzul [piso];
				carroNuevo.girar(grado);
				carroNuevo.avanzar(distanciaFijaRecorrida);
			}
		}
		else if (colorDetectado == colorVerde){
			for(int piso = 0; piso < 3; piso = piso +1){
				int grado = gradosVerde[piso];
				carroNuevo.girar(grado);
				carroNuevo.avanzar(distanciaFijaRecorrida);
			}
		}
		
		else if (colorDetectado == colorRojo){
			for(int piso = 0; piso < 3; piso = piso +1){
				int grado = gradosRojo[piso];
				carroNuevo.girar(grado);
				carroNuevo.avanzar(distanciaFijaRecorrida);
			}
		}
		
		}

	}

}
