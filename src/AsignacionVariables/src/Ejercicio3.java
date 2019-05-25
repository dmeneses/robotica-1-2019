import java.util.Scanner;


public class Ejercicio3 {
	public static void main(String[] args){
	
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
	
		int a=teclado.nextInt(); 
		int b=teclado.nextInt();
		int resultado;

	
	
	resultado= a*b;
	System.out.println("El resultado de la multiplicacion es "+resultado);
	
}
}

