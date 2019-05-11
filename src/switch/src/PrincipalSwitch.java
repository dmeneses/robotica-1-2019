import java.util.Scanner;


public class PrincipalSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int valor = s.nextInt();
		switch (valor){
		case 1: System.out.println("es uno"); break;
		case 2: System.out.println("es dos");break;
		default:System.out.println("por defecto");break;
		}

	}

}
