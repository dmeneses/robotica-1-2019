
public class ManejadorCarro {

	public static void main(String[] args) {
		Carro miCarro = new Carro();
		float colorRojo = 0.0f;
		
		float colorAzul = 2.0f;
		float colorVerde = 1.9f;
		float colorAmarillo = 3.0f;
		float colorDetectado = -1;
		boolean hayColor = false;
		while(hayColor == false){			
			colorDetectado = miCarro.dectectarColor();
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
 			miCarro.avanzar(distanciaAvance);
		}
	}

}
