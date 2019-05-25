import java.util.Scanner;


public class Ejercicio4 {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
	
		int a=teclado.nextInt(); 
		
			if(a>0){
				
				System.out.println(a+" es positivo");
				
			}
			else{
				System.out.println(a+" es negativo");
			}

			
		
		
	}
}
