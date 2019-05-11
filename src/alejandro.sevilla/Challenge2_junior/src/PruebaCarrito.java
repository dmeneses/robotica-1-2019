import lejos.hardware.Button;




public class PruebaCarrito {

	public static void main(String[] args) {
		
		Carro carroAle = new Carro();
		
		int[] gradosAzul = {315,-400,130};
		int[] gradosRojo = {80,-330,300};
		int[] gradosVerde = {-200,510,-290};
		int[] gradosAmarillo = {250,-85,69};
		double distanciaDeRecorrido = 30;
		
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		float colorAmarillo = 3.0f;
		
		float colorDetectado = 0;
		boolean detectarColor = false;
		while(detectarColor == false){
		    colorDetectado = carroAle.detectarColor();
		    if(colorDetectado == colorAzul
					   ||colorDetectado == colorRojo
					   ||colorDetectado == colorAmarillo
					   ||colorDetectado == colorVerde){
					  
				  detectarColor = true;
			} 
	
		    if(colorDetectado == colorAzul){
		    	for(int piso = 0; piso < 3; piso=piso+1 ){
					int grado = gradosAzul[piso];
					carroAle.girar(grado);
					carroAle.avanzar(distanciaDeRecorrido);
		    }
		    }
		    else if(colorDetectado == colorRojo){
				for(int piso = 0; piso < 3; piso=piso+1 ){
					int grado = gradosRojo[piso];
					carroAle.girar(grado);
					carroAle.avanzar(distanciaDeRecorrido);
				    }
		    }
		    else if(colorDetectado == colorVerde){
		    	for(int piso = 0; piso < 3; piso=piso+1 ){
					int grado = gradosVerde[piso];
					carroAle.girar(grado);
					carroAle.avanzar(distanciaDeRecorrido);
		    	}
		    }
		    else if(colorDetectado == colorAmarillo){
				for(int piso = 0; piso < 3; piso=piso+1 ){
				    int grado = gradosAmarillo[piso];
					carroAle.girar(grado);
					carroAle.avanzar(distanciaDeRecorrido);
				    }   	
		    	
		    	carroAle.detectarObstaculo(); 
		    } 
	    
	    
		
	     
		  }


		}
	
	}

