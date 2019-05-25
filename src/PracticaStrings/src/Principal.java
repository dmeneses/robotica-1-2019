
public class Principal {

	public static void main(String[] args){
		Cadenas c = new Cadenas();
		String cadena1 = "Cuan largo soy?";
		int tamCadena1 = c.obtenerTamaño(cadena1);
		System.out.println(tamCadena1);
		
		String hola= "hello";
		char car = c.obtenerCaracterEnUnaPosicion(hola,3);
		System.out.println(car);
		
		String q = "Something missing here";
		c.vocales(q);
		
		String s = "Something missing here";
		c.vocales2(s);
		
		String w = "Hola tu";
		c.contarVocales(w);
	}
	
}
