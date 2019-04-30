
public class Pruebita {

	public static void main(String[] args) {
		// Escriba un programa que dado un  numero
		// cualquiera del 1 al 7 muestre los dias de la semana
		// si el numero es 1 el programa debera mostrar
		// Lunes, si es 2 Martes, y asi sucesivamente....
		
		// declarar una variable del tipo int
		int numero;
		numero  = -190;
		String nombreDia = ""; // no se que dia es
		if (numero == 1){
			nombreDia = "Lunes";
		}
		else if (numero == 3) {
			nombreDia = "Miercoles";
		}
		else if (numero == 4) {
			nombreDia = "Miercoles";
		}
		else if (numero == 5) {
			nombreDia = "Miercoles";
		}
		else if (numero == 6) {
			nombreDia = "Miercoles";
		}
		else if (numero == 7) {
			nombreDia = "Domingo";
		}
		// cualquier otro valor
		else {
			nombreDia = "No conozco es dia";
		} 
		System.out.println("numero="+ numero + " es el dia "+ nombreDia);
	}

}
