package hola;

import lejos.hardware.Button;

public class inicio
{
	public static void main(String[] args)
	{
		thefish tf = new thefish();
		String morse = "";
		int simbolo = tf.morsecopiado();
		if(simbolo == 1)
		{
			morse = morse + ".";
		}
		else if(simbolo == 2)
		{
			morse = morse + "-";
		}
		else
		{
			morse = morse + " ";
		}
			
		
		/*String[] codigo = null;
		codigo[0] = ".-";		//a
		codigo[1] = "-...";		//b
		codigo[2] = "-.-.";		//c
		codigo[3] = "-..";		//d
		codigo[4] = ".";		//e
		codigo[5] = "..-.";		//f
		codigo[6] = "--.";		//g
		codigo[7] = "....";		//h
		codigo[8] = "..";		//i
		codigo[9] = ".---";		//j
		codigo[10] = "-.-";		//k
		codigo[11] = ".-..";	//l
		codigo[12] = "--";		//m
		codigo[13] = "-.";		//n
		codigo[14] = "---";		//o
		codigo[15] = ".--.";	//p
		codigo[16] = "--.-";	//q
		codigo[17] = ".-.";		//r
		codigo[18] = "...";		//s
		codigo[19] = "-";		//t
		codigo[20] = "..-";		//u
		codigo[21] = "...-";	//v
		codigo[22] = ".--";		//w
		codigo[23] = "-..-";	//x
		codigo[24] = "-.--";	//y
		codigo[25] = "--..";	//z
		codigo[26] = "-----";	//0
		codigo[27] = ".----";	//1
		codigo[28] = "..---";	//2
		codigo[29] = "...--";	//3
		codigo[30] = "....-";	//4
		codigo[31] = ".....";	//5
		codigo[32] = "-....";	//6
		codigo[33] = "--...";	//7
		codigo[34] = "---..";	//8
		codigo[35] = "----.";	//9
		codigo[36] = ".-";		//a
		codigo[37] = ".";		//e
		codigo[38] = "..";		//i
		codigo[39] = "---";		//o
		codigo[40] = "..-";		//u
		codigo[41] = ".-.-.-";	//.
		codigo[42] = "--..--";	//,
		codigo[43] = "..--..";	//?
		codigo[44] = ".-.-..";	//!
		codigo[45] = "-.--.";	//(
		codigo[46] = "-.--.-";	//)
		codigo[47] = "-.--.";	//[
		codigo[48] = "-.--.-";	//]
		codigo[49] = ".-...";	//&
		codigo[50] = "---...";	//:
		codigo[51] = "-.-.-.";	//;
		codigo[52] = "-...-";	//=
		codigo[53] = ".-.-.";	//+
		codigo[54] = "-....-";	//-
		codigo[55] = "..--.-";	//_
		codigo[56] = "...-..-";	//$
		codigo[57] = ".--.-.";	//@
		*/
		  String mensaje1 = ".... --- ..-. .-";

	
		Button.waitForAnyPress();
    }
}