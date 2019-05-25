import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int valor = s.nextInt();
		switch (valor) {
			case 1: System.out.println("es uno"); break;
			case 2: System.out.println("es dos"); break;
			case 3: System.out.println("es tres"); break;
			default:System.out.println("por defecto");
		
		
		}

	}

}
