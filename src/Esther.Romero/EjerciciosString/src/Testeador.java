
public class Testeador {

	public static void main(String[] args) {
		ConvertidorString convertidor = new ConvertidorString();
		String palabra = "hola, como estas 1234";
		char[] arreglo = convertidor.convertirStringEnArreglo(palabra);
		for(int piso=0; piso < arreglo.length; piso = piso +1)
		{
			System.out.println(arreglo[piso]);
		}
		
		char letraABuscar = 'a';
		char cambiarPor = '#';
		char[] codificado = convertidor.codificarPalabra(palabra,letraABuscar,cambiarPor);
		
		String aPartirDeArreglo = new String(codificado);
		System.out.println(aPartirDeArreglo);
		
		char[] miArreglo = aPartirDeArreglo.toCharArray();
		for(int piso=0; piso < arreglo.length; piso = piso +1)
		{
			System.out.println(miArreglo[piso]);
		}
	}

}
