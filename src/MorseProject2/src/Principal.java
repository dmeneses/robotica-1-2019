import java.util.Arrays;

import org.jfree.util.ArrayUtilities;
import org.jfree.util.StringUtils;

import lejos.hardware.Button;



public class Principal {
	public static void main(String[]args){
		
		Auto auto = new Auto();
		Dibujante d= new Dibujante(auto);
		String codigoMorse = "---";
		/*Lector l=new Lector();
		l.Leer();*/
		Traductor traductor = new Traductor();
		String textoTraducido = traductor.traducirCodigoATexto(codigoMorse);
		System.out.println("TEXTO TRADUCIDO: " + textoTraducido);
		d.dibujarCodigoMorse("...---...");
		Button.waitForAnyPress();
		
		
		
	}

}
