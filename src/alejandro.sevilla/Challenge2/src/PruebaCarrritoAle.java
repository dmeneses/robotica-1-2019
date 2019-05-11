
public class PruebaCarrritoAle {

	public static void main(String[] args) {
		//creamos una variable carrito
		Carrito  carritoAlejandro = new Carrito();
		
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		float colorAmarillo = 3.0f;
		float colorDetectado = -1;
		
		boolean hayColor = false;
		while(hayColor == false){
			
		
		  colorDetectado = carritoAlejandro.detectarColor();
		  if(colorDetectado == colorAzul
				   ||colorDetectado == colorRojo
				   ||colorDetectado == colorAmarillo
				   ||colorDetectado == colorVerde){
				  
			  System.out.println("detectamos color valido "+ colorDetectado);
			  hayColor = true;
		  }
		}
		System.out.println("color detectado es "+ colorDetectado);
		double distanciaDeAvance = 35;
		if(colorDetectado == colorAzul){
			//carritoAlejandro.avanzar(distanciaDeAvance);
			
		}
		//declarando un arreglo de enteros
		//reserva espacio para tres valores
		int[] grados = new int[3];
	    //poner elementos para el arreglo
		grados[0] = 40;//es la primera variable del valor
		grados[1] = -300;
		grados[2] = 280;//hasta aqui ya esta lleno
		for(int piso = 0; piso < 3; piso=piso+1 ){
			int grado = grados[piso];
			carritoAlejandro.girar(grado);
			carritoAlejandro.avanzar(distanciaDeAvance);
	
		}
			
			
		
			
			
			
	
	}
	
		
	}


