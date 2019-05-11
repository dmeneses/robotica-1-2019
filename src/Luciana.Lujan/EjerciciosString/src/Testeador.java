
public class Testeador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaramos una varaiabe del tipo ConvertirString
		ConventidorString convertidor =new ConventidorString();
		
		String palabra = "hola mundo";
	    
	   char []arreglo = convertidor.convertirStringEnArreglo(palabra);
	   for (int piso=0; piso<arreglo.length; piso = piso + 1)
	   {
		   System.out.println(arreglo[piso]);
		   
	   }
		// modificar mensaje 
	   char letraAbuscar ='a';
	   char cambiarPor = '#';
	   char [] codificado = convertidor.codificarPalabra (palabra, letraAbuscar, cambiarPor);
	   
	   String aApratirDeArreglo = new String(codificado);
	   	System.out.println(aPartirDeArreglo);
	   
	   char [] miArreglo = aPartirDeArreglo.toCharArray;
	   for (int piso=0; piso < miArreglo. length; piso = piso +1){
		   System.out.println(miArreglo[piso]);
	   }
		char[]letraBusqueda = {'a', 'z','1', 'T'};
		char[]letraReemplazo = {'A','Z','#','.'};
		String miPalabra = " la ecucion respuesta es; z=z +t111;";
		String palabraCodificada = convertidor.codificar(miPalabra,letraBusqueda,letraReemplazo);
		
		
		String textoNormal = "aeiou";
		String textoMorse = convertidor.convertirAMorse (textoNormal);
		if (textoMorse == ".-..--..");
	    


}
