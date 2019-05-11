
public class ConvertidorString {
	String codificar(String miPalabra,char[] Busqueda,char[]Remplazo ){
		int cantidadDeCaracteres = miPalabra.length();
		char[] resultado = new char[cantidadDeCaracteres];
		for(int piso = 0; piso < cantidadDeCaracteres; piso = piso+1)
		{
			//for (int nivel = 0; nivel < ; n)
			char caracter = miPalabra.charAt(piso);
			if(caracter == Busqueda[0]){
				caracter = Remplazo[0];
			}
			if(caracter == Busqueda[1]){
				caracter = Remplazo[1];
			}
			if(caracter == Busqueda[2]){
				caracter = Remplazo[2];
			}
			if(caracter == Busqueda[3]){
				caracter = Remplazo[3];
			}
			resultado[piso] = caracter;
		}
		return miPalabra;
	}
	
	
	
	
	
	
	//si palabra es mari y buscar es a y remplazo
	//debera ser entonces m#ri#
	char []codificarPalabra(String miPalabra,char buscar,char remplazo)
	{
		int cantidadDeCaracteres = miPalabra.length();
		char[] resultado = new char[cantidadDeCaracteres];
		for(int piso = 0; piso < cantidadDeCaracteres; piso = piso+1)
		{
			char caracter = miPalabra.charAt(piso);
			//preguntar si el caracter es el buscar el valor buscar
			if (caracter == buscar){
				//busca y cambia la letra o caracter
				caracter = remplazo;
			}
			resultado[piso] = caracter;
		}
		return resultado;
	}
	
	
	
	char[] convertirStringArreglo(String texto){
		//null significa que no sabemos la cantidad de caracteres
		char[] resultado = null;
		//lenght cuenta todos los caracteres
		int cantidadDeCaracteres = texto.length();
		resultado = new char[cantidadDeCaracteres];
		System.out.println("la cantidad de caracteres es "+cantidadDeCaracteres);
		//usamos for para con
		for(int piso = 0; piso < cantidadDeCaracteres; piso = piso+1){
			char caracter = texto.charAt(piso);
			resultado[piso] = caracter;
		}
		return resultado;
	}
	

}
