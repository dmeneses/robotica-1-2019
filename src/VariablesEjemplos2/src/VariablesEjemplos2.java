import java.util.Scanner;


public class VariablesEjemplos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
      
	int numero = teclado.nextInt();
	
	int nacimiento = 2002;
	//int numero2 = 2019;
	//int resultado= -numero1 + numero2;
	//System.out.println(resultado);
	int resultado = +numero - nacimiento;		
	System.out.println(resultado);	
	
 	}

}
