
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {30, 24, 65};
		int sumatotal=0;
		for (int cont=0; cont<=2; cont= cont+1){
			int unNumero = array[cont];
			sumatotal=unNumero+sumatotal;

		}
		int promedio;
		int tamañoArreglo= array.length;
		promedio= sumatotal/tamañoArreglo;
		System.out.println(promedio);

	}

}
