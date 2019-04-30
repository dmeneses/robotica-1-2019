
public class ConvertidorString2 {
	String[] codificar(String miPalabra, char[] letrasBusqueda, char[] letrasReemplazo)
	{
		int cantidadCaracteres = miPalabra.length();
		char[] resultado = new char[cantidadCaracteres];
		for(int piso = 0; piso < cantidadCaracteres; piso = piso +1 )
		{
			char caracter = miPalabra.charAt(piso);
			if(caracter == letrasBusqueda){
				caracter = letrasReemplazo;
			}
			resultado[piso] = caracter;
		}
		return resultado;
		
	char[] convertirStringEnArreglo(String texto)
	{
		char [] resultado = null;
		int cantidadCaracteres = texto.length();
		System.out.println("La palabra que voy a convertir es de tamaño" + cantidadCaracteres);
		resultado = new char[cantidadCaracteres];
		for(int piso = 0; piso < cantidadCaracteres; piso = piso +1 )
		{
			char caracter = texto.charAt(piso);
			resultado[piso] = caracter;
		}
		return resultado;
}

}
