import java.util.Scanner;


public class ejemplos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		if (numero < 0)
		{
		 System.out.println("negativo");
		}
		if (numero >= 0)
		{
			
			System.out.println("positivo");
		}
	}
		
	}

}
