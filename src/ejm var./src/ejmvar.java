import java.util.Scanner;


public class ejmvar 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Nota=scanner.nextDouble();
		
		if(Nota>=0 && Nota<=50){
			System.out.println("reprobado");
		}
	if (Nota>=51 && Nota<=70){
		System.out.println("reforzamiento");
	}
	if (Nota>=71 && Nota<=100){
		System.out.println("aprobado");
	}
		}
	}


