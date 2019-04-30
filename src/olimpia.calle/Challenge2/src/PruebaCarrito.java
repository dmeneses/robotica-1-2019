import lejos.hardware.Button;


public class PruebaCarrito {

	public static void main(String[] args) {
		// el tipo de dato es Carrito
		// carritoMaria contenedora o nombre de variable
		Carrito carritoMaria = new Carrito();
		// dectectarColor es un metodo = accion que todo
		// Carrito sabe realizar
		float colorRojo = 0.0f;
		
		float colorAzul = 2.0f;
		float colorVerde = 1.9f;
		float colorAmarillo = 3.0f;
		float colorDetectado = -1;
		boolean hayColor = false;
		while(hayColor == false){			
			colorDetectado = carritoMaria.dectectarColor();
			if (colorDetectado == colorAzul
					|| colorDetectado == colorRojo
					|| colorDetectado == colorVerde
					|| colorDetectado == colorAmarillo) {
				System.out.println("detectamos color valido"+ colorDetectado);
				hayColor = true;
			}
		}
		System.out.println("color Detectado es "+ colorDetectado);
		double distanciaAvance = 100; // 100 cm
 		if (colorDetectado == colorAzul){
			// avanzar distanciaAvance
			// carritoMaria.avanzar(distanciaAvance);
		} 		
 		// int[] estoy declarando un arreglo de valores enteros
 		// new int[3]  reservar espacio para 3 valores
 		// tamanio arreglo es 3
 		int[] grados = new int[3];
 		// poner elementos en el arreglo
 		// posiciones o indices van desde 0 hasta (tamanio - 1)
 		grados[0] = 30; // en la primera posicion del arreglo pongo el valor 30
 		grados[1] = 100;
 		grados[2] = -80; // mi capacidad esta llena en el indice 2
 		distanciaAvance = 30;
 		for(int piso = 0; piso < 3; piso = piso + 1) {
 			int grado  = grados[piso];
 			carritoMaria.girar(grado);
 			carritoMaria.avanzar(distanciaAvance);
 		}
 		
 		
		
	}

}
