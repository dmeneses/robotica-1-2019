
public class Testeador3 {

	public static void main(String[] args) {
ConvertidorString3 convertidor = new ConvertidorString3();
		
		String textoNormal = "aeiou";
		char[] arreglo = convertidor.convertirStringEnArreglo(textoNormal);
		for(int piso=0; piso < arreglo.length; piso = piso + 1)
		{
			System.out.println(arreglo[piso]);
		}
		String textoMorse = convertidor.convertirAMorse(textoNormal);
		if (textoMorse == ".- . .. --- ..-")
		{
			System.out.print("textoNormal="+ textoNormal);
			System.out.print(" en morse es textoMorse="+ textoMorse);
		}
		
		String aPartirDeArreglo = new String(textoMorse);
		System.out.println(aPartirDeArreglo);
		
		char[] miArreglo = aPartirDeArreglo.toCharArray();
		for(int piso=0; piso < miArreglo.length; piso = piso + 1)
		{
			System.out.println(miArreglo[piso]);
		}

	}

}
