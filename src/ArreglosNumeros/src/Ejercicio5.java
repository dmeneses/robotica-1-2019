
public class Ejercicio5 {

	public static void main(String[] args) {

		String[] jugadores = {"Pedro", "Pablo", "Juan", "Roberto"};
		for (int cont=0; cont<=3; cont= cont+1){
			String nombre = jugadores[cont];
			if(cont<=1){
			System.out.println(nombre+ " ganador");
			}
			else{
				System.out.println(nombre+ " perdedor");
			}
		}
		

	}

}
