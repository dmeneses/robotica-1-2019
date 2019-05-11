import lejos.hardware.Button;

public class Principal {

	public static void main(String[] args) {
		RuedasGrados a = new RuedasGrados();

		/*
		 * a.avanzarCm(50);// 1 a.girarIzq(90); a.avanzarCm(50); //2
		 * a.GiraDerecho(90); a.avanzarCm(50);// 3 a.GiraDerecho(90);
		 * a.avanzarCm(50);// 4 a.girarIzq(90); a.avanzarCm(50);
		 * 
		 * int[] miarreglo = { 30, 75, 50, 75, 50, 75 }; for (int cont = 0; cont
		 * <= 5; cont = cont + 2) { int numero = miarreglo[cont]; int numero2 =
		 * miarreglo[cont + 1];
		 * 
		 * a.avanzarCm(numero); a.girarIzq(numero2);
		 * 
		 * } a.ultrasonico();
		 */

		/*
		a.GirarEje(90);
		Button.waitForAnyPress();
		a.GirarEje(180);
		Button.waitForAnyPress();
		a.GirarEje(270);
		Button.waitForAnyPress();
		a.GirarEje(360);
		Button.waitForAnyPress();
		*/
		boolean variables = true;
		while (variables == true) {
			int color = a.valor();
			System.out.println( color +"color" );
			switch (color) {

			case 2:
				
				
				int[] miarreglo = { 70, 30, -100,30, 30 };
				int tam = miarreglo.length; 
				for (int cont = 0; cont < tam; cont = cont + 1) {
					int numero = miarreglo[cont];
					if (cont % 2 == 0) {
						a.GirarEje(numero);
					} else {
						

						a.avanzarCm(numero);

					}

				}
				//variables = false;
				a.ultrasonico();
				break;// azul
			case 1:

				int[] miarreglo1 = { -50, 30, 120, 30, -70 };
				int tamz = miarreglo1.length;
				for (int cont = 0; cont < tamz; cont = cont + 1) {
					int numero = miarreglo1[cont];
					if (cont % 2 == 0) {
						a.GirarEje(numero);
					} else {

						a.avanzarCm(numero);

					}

				}
			//	variables = false;
				a.ultrasonico();
				break;// verde
			case 3:

				int[] miarreglo2 = { 60, 30, -120, 30, 60 };
				int tamy = miarreglo2.length;
				for (int cont = 0; cont < tamy; cont = cont + 1) {
					int numero = miarreglo2[cont];
					if (cont % 2 == 0) {
						a.GirarEje(numero);
					} else {

						a.avanzarCm(numero);

					}

				}
		//		variables = false;
				a.ultrasonico();
				break;// amarrillo
			case 0:

				int[] miarreglo3 = { 20, 30, -90, 30, 70 };
				int tamx = miarreglo3.length;
				for (int cont = 0; cont < tamx; cont = cont + 1) {
					int numero = miarreglo3[cont];
					if (cont % 2 == 0) {

						a.GirarEje(numero);

					} else {

						a.avanzarCm(numero);

					}

				}
				//variables = false;
				a.ultrasonico();
				break;// rojo
			default:
				a.avanzarCm(0);

			}
		}
		a.ultrasonico();
	//	Button.waitForAnyPress();

	}
	
}
