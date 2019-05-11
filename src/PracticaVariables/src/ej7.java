import java.util.Scanner;


public class ej7 {
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);
		int numero = teclado.nextInt();
		
		if(numero>=1 && numero<=10){
		 
		   for(int i=1; i<=numero;i ++){
		   System.out.println(i+"hola");
		   }
	}
		   else {
			   System.out.println("No se encuentra en el rango");
		   }
	}

}
