
public class ConventidorString {
	char[] codificarPalabra (String miPalabra,char buscar,char reemplazo){
		int cantidadCaracteres = miPalabra.length();
		char[]resultado = new char [cantidadCaracteres];
		
		for (int piso =0; piso < cantidadCaracteres; piso = piso + 1){
			char caracter = miPalabra.charAt(piso);
			if(caracter == buscar){
				caracter = reemplazo;
			}
			resultado[piso]= caracter;
			
		}
		return resultado;
	}
	
	char[] convertirStringEnArreglo(String texto){
		
		char[]resultado = null;
		int cantidadCaracteres = texto.length();
		System.out.println("son"+cantidadCaracteres+"caracteres");
		resultado = new char [cantidadCaracteres];
		for (int piso=0; piso< cantidadCaracteres;piso ++){
			char caracter = texto.charAt(piso);
			resultado[piso]= caracter;
			
		}
		return resultado;
		
	}

}
