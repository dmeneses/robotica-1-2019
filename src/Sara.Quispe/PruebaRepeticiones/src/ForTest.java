
public class ForTest {

	public static void main(String[] args) {
		// mostrar la tabla de multiplicar
		//para un numero cualquiera cuyos valores puedan ser 
		//de 1 a 9
		//si el numero es 1 deberia mostrar 1*1=1,1*2=2....
		int numero=5;
		
		if (numero>=1 && numero<=9){
			//multiplicador++ es igual a multiplicador= multiplicador + 1; 
			for (int multiplicador=1;multiplicador<=10;multiplicador++){
				int resultado= numero* multiplicador;
				System.out.println(numero + "*" + multiplicador+"= "+ resultado);
			}
			
			
			
			/*int multiplicador=1;
			int resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			
			
			multiplicador = multiplicador +1 ;
			resultado= numero* multiplicador;
			System.out.println(numero + "*" + multiplicador + "=" + resultado);
			*/
			 
	}
		else{
			System.out.println("No se multiplicar para el numero" + numero);
		}

	}

}
