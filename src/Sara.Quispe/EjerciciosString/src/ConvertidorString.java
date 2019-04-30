
 public class ConvertidorString 
{
	// si palabra es maria y buscar es a y reemplazo es #
	// entonces el resultado debera ser m#ri#
	char[]  codificarPalabra(String miPalabra, char buscar, char reemplazo)
	{
		int cantidadCaracteres = miPalabra.length();
		char[] resultado = new char[cantidadCaracteres];
		
		for(int piso = 0; piso < cantidadCaracteres; piso = piso + 1)
		{
			char caracter = miPalabra.charAt(piso);
			// preguntar si la letra o el caracter es el valor que tiene buscar
			if (caracter == buscar){
				// cambiar valor
				caracter = reemplazo;
			}
			// anadir caracter al arreglo
			resultado[piso] = caracter;
		}
		
		return resultado;
	}
	
	char[]  convertirStringEnArreglo(String texto)
	
	{
		// null quiere decir no se aun cuantos elementos tendra el char[]
		char[] resultado = null;
		// lenght() cuenta CUANTOS CARACTERES HAY EN texto
		int cantidadCaracteres = texto.length();
		System.out.println("La palabra que voy a convertir es de tamano" + cantidadCaracteres);
		// mi arreglo resultado tiene capacidad para tener cantidadCaracteres
		resultado = new char[cantidadCaracteres];
		for(int piso = 0; piso < cantidadCaracteres; piso = piso + 1)
		{
			// sacamos un solo caracter de la cadena
			char caracter = texto.charAt(piso);
			// ponemos el caracter en el arreglo
			resultado[piso] = caracter;
		}
		return resultado;
	}
}
