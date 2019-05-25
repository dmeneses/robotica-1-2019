import lejos.hardware.Button;

public class PrincipaColor2 {

	public static void main(String[] args) {
		int[] rojo = { 20, 30, -90, 30, 70};
		int[] verde = { -50, 30, 120, 30, -70};
		int[] azul = { 70, 30, -100, 30, 30 };
		int[] amarillo = { 60, 30, -120, 30, 60 };
		EV3 miEV3 = new EV3();
	boolean obtenerColor = true;

		while (obtenerColor == true) {
			int color = miEV3.obtenerColor();
			System.out.println(color);
			switch (color) {
			case 0:
				for (int cont = 0; cont < rojo.length; cont = cont + 1) {
					int avanzarGirar = rojo[cont];

					if (cont % 2 == 0) {
						miEV3.centro(avanzarGirar);
					} else {
						miEV3.avanzarcm(avanzarGirar);
					}		
				
				}
	
				double distancia=miEV3.getRange()*100;				
				System.out.println(distancia);
				miEV3.avanzarcm((int) distancia);
				break;
				
			case 1:
				for (int cont = 0; cont <verde.length; cont = cont + 1) {
					int avanzarGirar = verde[cont];

					if (cont % 2 == 0) {
						miEV3.centro(avanzarGirar);
					} else {
						miEV3.avanzarcm(avanzarGirar);
					}
				
				}
				double distancia1=miEV3.getRange()*100;
				System.out.println(distancia1);
				miEV3.avanzarcm((int) distancia1);
				break;
				
			case 2:
				for (int cont = 0; cont < azul.length; cont = cont + 1) {
					int avanzarGirar = azul[cont];

					if (cont % 2 == 0) {
						miEV3.centro(avanzarGirar);
					} else {
						miEV3.avanzarcm(avanzarGirar);
					}
			
				}
				double distancia2=miEV3.getRange()*100;
				System.out.println(distancia2);
				miEV3.avanzarcm((int) distancia2);
				break;
				
			case 3:
				for (int cont = 0; cont < amarillo.length; cont = cont + 1) {
					int avanzarGirar = amarillo[cont];

					if (cont % 2 == 0) {
						miEV3.centro(avanzarGirar);
					} else {
						miEV3.avanzarcm(avanzarGirar);
					}
				
				}
				
				double distancia3=miEV3.getRange()*100;
				System.out.println(distancia3);
				miEV3.avanzarcm((int) distancia3);
				break;
			default:
				System.out.println("por defecto");

			}
			

		}
		
	}
}
