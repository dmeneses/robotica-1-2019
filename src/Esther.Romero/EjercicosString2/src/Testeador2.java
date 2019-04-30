
public class Testeador2 {

	public static void main(String[] args) {
		ConvertidorString2 convertidor = new ConvertidorString2();
		String miPalabra = "la ecuacion respuesta es: z = z + T111;";
		char[] arreglo = convertidor.convertirStringEnArreglo(miPalabra);
		for(int piso=0; piso < arreglo.length; piso = piso + 1)
		{
			System.out.println(arreglo[piso]);
		}
		char[] letrasBusqueda = {'a', 'z', '1', 'T'};
		char[] letrasReemplazo = {'A', 'Z', '#', '.'};
		if(letrasBusqueda != letrasReemplazo)
		{
			char letraABuscar = 'a';
			char cambiarPor = 'A';
			char letraABuscar2 = 'z';
			char cambiarPor2 = 'Z';
			char letraABuscar3 = '1';
			char cambiarPor3 = '#';
			char letraABuscar4 = 'T';
			char cambiarPor4 = '.';
			
		}
		String[] palabraCodificada = convertidor.codificar(miPalabra, letrasBusqueda, letrasReemplazo);
		
		String aPartirDeArreglo = new String (palabraCodificada);
		System.out.println(aPartirDeArreglo);
		
		char[] miArreglo = aPartirDeArreglo.toCharArray();
		for(int piso=0; piso < miArreglo.length; piso = piso + 1)
		{
			System.out.println(miArreglo[piso]);
		}
	}

}
