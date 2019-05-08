import java.util.HashMap;
import java.util.Map;

import lejos.utility.Delay;



public class traductor

{

	char sim;
	
	String palabra;
	
	Map mochila = new HashMap();
	viernes cosa = new viernes();
	public traductor()
	{
	     
		mochila.put(".-", "A");
		mochila.put("-...", "B");
		mochila.put("-.-.", "C");
		mochila.put("-..", "D");
		mochila.put(".", "E");
		mochila.put("..-.", "F");
		mochila.put("--.", "G");
		mochila.put("....", "H");
		mochila.put("..", "I");
		mochila.put(".---", "J");
		mochila.put("-.-", "K");
		mochila.put(".-..", "L");
		mochila.put("--", "M");
		mochila.put("-.", "N");
		mochila.put("---", "O");
		mochila.put(".--.", "P");
		mochila.put("--.-", "Q");
		mochila.put(".-.", "R");
		mochila.put("...", "S");
		mochila.put("-", "T");
		mochila.put("..-", "U");
		mochila.put("...-", "V");
		mochila.put(".--", "W");
		mochila.put("-..-", "X");
		mochila.put("-.--", "Y");
		mochila.put("--..", "Z");
		
	}
	
	public char traducir()
	{
		
		 int t = cosa.medir();
		if( t > 1 &&  t <= 500)
		{
			sim = '.';
			palabra = palabra + sim; 
			System.out.println(sim);
			System.out.println(palabra);
			Delay.msDelay(1000);
		}
		
		if(cosa.medir() >= 500)
		{
			sim = '-';
			palabra = palabra + sim;
			System.out.println(sim);
			System.out.println(palabra);
			Delay.msDelay(1000);
			
		}
		
		return sim;
		
	}
	
	public void presionar()
	{
		
	}
}
