
public class PruebaCarrito {

	public static void main(String[] args) {
		
		//ROJO=0.0
		//AZUL=2.0
		//AMARILLO=3.0
		//VERDE=1.0
		//NEGRO=7.0
		//PLOMO=7.0
		//BLANCO=6.0
		
		Carrito carritoSara=new Carrito();
		
		float colorRojo=0.0f;
		float colorAzul=2.0f;
		float colorVerde=1.0f;
		float colorAmarillo=3.0f;
		float colorDetectado=-1;
		boolean hayColor=false;
		
		while(hayColor== false){  
		
			
		colorDetectado=carritoSara.detectarColor();
		if(colorDetectado==colorRojo
		
				|| colorDetectado !=colorRojo
				|| colorDetectado !=colorVerde
				|| colorDetectado !=colorAmarillo){
		colorDetectado=carritoSara.detectarColor();
		 System.out.println("detectamos color valido"+ colorDetectado);
		hayColor=true;
	}
		}
		System.out.println("color detectado es " + colorDetectado); 
		double distanciaAvance=30;
		if (colorDetectado== colorAzul){
			carritoSara.avanzar(distanciaAvance);
			
		}
		//int[] estoy declarando un arreglo de valores enteros
		int [] grados = new int[3];
		grados[0]=30;
		grados[1]=100;
		grados[2]=-80;
		for(int piso=0;piso<3;piso=piso+1){
			int grado =grados[piso];
			carritoSara.girar(grado);
			carritoSara.avanzar(distanciaAvance);
		
		}
		
	 
	
	}

}