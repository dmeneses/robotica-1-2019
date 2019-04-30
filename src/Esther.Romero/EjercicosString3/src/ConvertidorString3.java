
public class ConvertidorString3 {
	String[] convertirAMorse(String miPalabra, char buscar, char reemplazo)
	{
		int cantidadCaracteres = miPalabra.length();
		String[] resultado = new String[cantidadCaracteres];
		for(int piso = 0; piso < cantidadCaracteres; piso = piso +1 )
		{
		char caracter = miPalabra.charAt(piso);
			if(caracter == buscar){
				caracter = reemplazo;
			}
			resultado[piso] = caracter;
		}
		return resultado;
	}
	char[] convertirStringEnArreglo(String texto)
	{
		char [] resultado = null;
		int cantidadCaracteres = texto.length();
		System.out.println("La palabra que voy a convertir es de tamaño" + cantidadCaracteres);
		resultado = new char[cantidadCaracteres];
		for(int piso = 0; piso<cantidadCaracteres; piso = piso +1 )
		{
			char caracter = texto.charAt(piso);
			resultado[piso] = caracter;
		}
		return resultado;
	}
}
