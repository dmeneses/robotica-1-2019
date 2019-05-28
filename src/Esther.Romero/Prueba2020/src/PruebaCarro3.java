import lejos.hardware.Button;


public class PruebaCarro3 {

	public static void main(String[] args) {
		int[] gradosRojo = {20, -90, 70};
		int[] gradosAzul ={70, -100, 30}; //{70, -100, 30};
		int[] gradosVerde ={-40, 100, -70}; //{-50, 120, -70};
		double distanciaFijaRecorrida = 35;
		Carro3 carritoEsther = new Carro3 ();
	
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		float colorDetectado = -1;
		boolean detecteColor = false;
		
		while(detecteColor == false){
			colorDetectado = carritoEsther.detectarColor();
			if(colorDetectado == colorRojo
					|| colorDetectado == colorAzul
					|| colorDetectado == colorVerde){
				System.out.println("detectamos color Valido!!" + colorDetectado);
				detecteColor = true;
		}
	}
		
			if (colorDetectado == colorAzul){
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosAzul[piso];
					System.out.println(grado);
					if (piso ==0){
						Button.LEDPattern(5);
					    carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==1){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==2){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
				}
			}
			else if (colorDetectado == colorVerde){
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosVerde[piso];
					System.out.println(grado);
					if (piso ==0){
						Button.LEDPattern(5);
					    carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==1){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==2){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
				}
			}
			else if (colorDetectado == colorRojo){
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosRojo[piso];
					System.out.println(grado);
					if (piso ==0){
						Button.LEDPattern(5);
					    carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==1){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);
					    
				    }
					if (piso ==2){
						carritoEsther.girar(grado);
					    carritoEsther.avanzar(distanciaFijaRecorrida);

				    }
					
					/*boolean detecteSiguiente = false;
					double distanciaDetectada = 0;
					while(detecteSiguiente == false){
						distanciaDetectada = carritoEsther.detectarObstaculo();
						detecteSiguiente = true;
					}*/
				}
			}

	}

}