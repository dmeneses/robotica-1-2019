
public class Testeador {

	public static void main(String[] args) {
		//declaramos una variable del tipo convertidor
		ConvertidorString convertidor = new ConvertidorString();
		
		String palabra = "hola";
		//char[] caja de los elementos es un char
		char[] arreglo = convertidor.convertirStringArreglo(palabra);
		for(int piso = 0; piso < arreglo.length; piso = piso+1)
		{
			System.out.println(arreglo[piso]);
						
		}
		
		//2.codificar un mensaje
		char letraABuscar = 'a';
		char cambiarPor = '#';
		char[] codificado = convertidor.codificarPalabra(palabra,letraABuscar,cambiarPor);
		
		String apartirDeArreglo = new String(codificado);
		System.out.println(apartirDeArreglo);
		//de forma directa
		char[] miArreglo = apartirDeArreglo.toCharArray();
		for(int piso = 0; piso < miArreglo.length; piso = piso+1)
		{
			System.out.println(miArreglo[piso]);
		}
		//3.codificar con varios caracteres'
		char[] letrasBusqueda = {'a','z','1','T'};
		char[] letrasRemplazo = {'A','Z','#','.'};
		String miPalabra = "la ecuacion respuesta es:  a = z +T111;";
		String palabraCodificada = convertidor.codificar(miPalabra, letrasBusqueda, letrasRemplazo);
		
		String DelArreglo = new String(palabraCodificada);
		System.out.println(DelArreglo);
		


	}

}
