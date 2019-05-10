package hola;

import lejos.hardware.Button;

public class inicio
{

	
	public static void main (String[] morsecopiado)
	{
		thefish tf = new thefish();
		String morse = "";
		String palabraMorse = tf.morsecopiado();
		
		int contador = 0;
		int tamanioPalabra = palabraMorse.length();
		String[] codigo = new String[27];
		
		codigo[0] = ".-";		//a
		codigo[1] = "-...";     //b
		codigo[2] = "-.-.";   	//c
		codigo[3] = "-..";		//d
		codigo[4] = ".";		//e
		codigo[5] = "..-.";     //f
		codigo[6] = "--.";		//g
		codigo[7] = "...."; 	//h
		codigo[8] = "..";		//i
		codigo[9] = ".---"; 	//j
		codigo[10] = "-.-"; 	//k
		codigo[11] = ".-.."; 	//l
		codigo[12] = "--";		//m
		codigo[13] = "-.";		//n
		codigo[14] = "---";     //o
		codigo[15] = ".--.";	//p
		codigo[16] = "--.-";	//q
		codigo[17] = ".-."; 	//r
		codigo[18] = "..."; 	//s
		codigo[19] = "-";		//t
		codigo[20] = "..-";		//u
		codigo[20] = "..-";     //v
		codigo[22] = ".--"; 	//w
		codigo[23] = "-..-";	//x
		codigo[24] = "-.--";	//y
		codigo[25] = "--..";	//z
		codigo[26] = "-----";   //0
		String traduccion = "";
		String letraMorse = "";
		while(contador < tamanioPalabra)	    
		{
			char letra = palabraMorse.charAt(contador);
			System.out.println("letra:" + letra);
			contador++;
			
			if(letra == ' ')
			{
				if(codigo[0].equals(letraMorse))
				if(codigo[1].equals(letraMorse))
				if(codigo[2].equals(letraMorse))	
				if(codigo[3].equals(letraMorse))	
				if(codigo[4].equals(letraMorse))
				if(codigo[5].equals(letraMorse))
				if(codigo[6].equals(letraMorse))					
				if(codigo[7].equals(letraMorse))
				if(codigo[8].equals(letraMorse))
				if(codigo[10].equals(letraMorse))
				if(codigo[11].equals(letraMorse))
				if(codigo[12].equals(letraMorse))
				if(codigo[13].equals(letraMorse))
				if(codigo[14].equals(letraMorse))	
				if(codigo[15].equals(letraMorse))	
				if(codigo[16].equals(letraMorse))
				if(codigo[17].equals(letraMorse))
				if(codigo[18].equals(letraMorse))					
				if(codigo[19].equals(letraMorse))
			    if(codigo[20].equals(letraMorse))
	            if(codigo[21].equals(letraMorse))
				if(codigo[22].equals(letraMorse))	
				if(codigo[23].equals(letraMorse))	
				if(codigo[24].equals(letraMorse))
				if(codigo[25].equals(letraMorse))
				if(codigo[26].equals(letraMorse))		
					
				{
					traduccion = traduccion + "a"; 
					traduccion = traduccion + "b"; 
					traduccion = traduccion + "c"; 
					traduccion = traduccion + "d";
					traduccion = traduccion + "e"; 
					traduccion = traduccion + "f"; 
					traduccion = traduccion + "g"; 
					traduccion = traduccion + "h";
					traduccion = traduccion + "i"; 
					traduccion = traduccion + "j"; 
					traduccion = traduccion + "k"; 
					traduccion = traduccion + "l";
					traduccion = traduccion + "m"; 
					traduccion = traduccion + "n"; 
					traduccion = traduccion + "o"; 
					traduccion = traduccion + "p";
					traduccion = traduccion + "q"; 
					traduccion = traduccion + "r"; 
					traduccion = traduccion + "s"; 
					traduccion = traduccion + "t";
					traduccion = traduccion + "u"; 
					traduccion = traduccion + "v"; 
					traduccion = traduccion + "w"; 
					traduccion = traduccion + "x";
					traduccion = traduccion + "y";
					traduccion = traduccion + "z";
					}
			}
			else
			{
				letraMorse += letra; 
			}
			
		}		
		
		System.out.println(palabraMorse);	

	
		Button.waitForAnyPress();
    }
}