
public class FortTest {

	public static void main(String[] args) {
		//mostrar la tabla de multiplicar un numero cualquiera 
		//cuyos valores pueden ser del 1 al 9
		// si el numero es 1 deberia mostrar 1*1 = 1, 1*2=2....etc
		
		int numero =9;
		if (numero >= 1&& numero <= 9){
			 for(int multiplicador=1;multiplicador<=10; multiplicador++){
					int resultado = numero* multiplicador;
					System.out.println(numero + "*"+multiplicador+"="+resultado);
			 }
			/*int multiplicador = 1;
			int resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + ""+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			multiplicador = multiplicador +1;
			resultado = numero* multiplicador;
			System.out.println(numero + "*"+multiplicador+"="+resultado);
			*/
		}
		else{
			System.out.println("no se multiplicar para el numero"+ numero);
			
		}
	
		
		

	}

}
