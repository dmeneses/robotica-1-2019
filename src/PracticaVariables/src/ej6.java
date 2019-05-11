import java.util.Scanner;


public class ej6 {
	public static void main(String args[]){
	Scanner teclado=new Scanner(System.in);
	double radio = teclado.nextInt();
	
	double perimetro=(2*Math.PI*radio);
	double area=(Math.PI*radio*radio);
	
	System.out.println(perimetro);
	System.out.println(area);
	}
}
