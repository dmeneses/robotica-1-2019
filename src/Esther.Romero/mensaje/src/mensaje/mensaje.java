package mensaje;

public class mensaje {

	public static void main(String[] args) {
		String letras = "abcdefghijklmnopqrstuvwxyz";
		frase = frase.toLowerCase();
		
		String simboloLetra[] = new String[25];
		
		simboloLetra[0] = ".-"; 		//a
		simboloLetra[1] = "-...";		//b
		simboloLetra[2] = "-.-.";		//c
		simboloLetra[3] = "-..";		//d
		simboloLetra[4] = ".";		    //e
		simboloLetra[5] = "..-.";		//f
		simboloLetra[6] = "--.";		//g
		simboloLetra[7] = "....";		//h
		simboloLetra[8] = "..";		    //i
		simboloLetra[9] = ".---";		//j
		simboloLetra[10] = "-.-";		//k
		simboloLetra[11] = ".-..";	    //l
		simboloLetra[12] = "--";		//m
		simboloLetra[13] = "-.";		//n
		simboloLetra[14] = "---";		//o
		simboloLetra[15] = ".--.";	    //p
		simboloLetra[16] = "--.-";	    //q
		simboloLetra[17] = ".-.";		//r
		simboloLetra[18] = "...";		//s
		simboloLetra[19] = "-";		    //t
		simboloLetra[20] = "..-";		//u
		simboloLetra[21] = "...-";	    //v
		simboloLetra[22] = ".--";		//w
		simboloLetra[23] = "-..-";	    //x
		simboloLetra[24] = "-.--";	    //y
		simboloLetra[25] = "--..";	    //z
		
		
		
		
		
		
		
		
		String morse = " ";
		for(int i = 0; i < frase.length(); i++ ){
			if(frase.charAt(i)== ' ') morse = morse + ' ';
			else{
				for (int a =0;a < letras.length(); a++ ){
					if(frase.charAt(i) == letras.charAt(a))
						morse = morse + simboloLetra[a];
				}
			}
		}
		return morse = morse.substring(1, morse.length());
		}

	}

}
