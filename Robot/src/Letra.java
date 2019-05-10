import lejos.hardware.Button;


public class Letra 
{
	
	Telegrafo telegrafo1;
	int t = 1;
	String letra = "";	

public Letra(int t)
{
	telegrafo1 = new Telegrafo();
	t=1;
}

public String insertarletra()
{
	letra = "";
	t=1;
	while(t==1)
	{

			int simbolo = telegrafo1.insertarmorse();

			System.out.println("Sim: " + simbolo);


			if(simbolo==0)
			{
				System.out.println("error");
			}
			else
			{
				if (simbolo == 3)
				{
					System.out.println("Letra: completa");
					t=2;
					
				}
				else
				{
					letra = letra + simbolo;
				}
			}
			//Button.waitForAnyPress();
			
			System.out.println("Letra: " + letra);
			
			Button.waitForAnyPress();
			
	}
	//letra = letra + "3;
	Button.waitForAnyPress();
	return letra;
}

public String traducirletra()
{
	String letratrad = "";
	//System.out.println("l en tra: " + letra);
	if (letra.equals("12"))
	{
		letratrad = "A";
	}
	if (letra.equals("2111"))
	{
		letratrad = "B";
	}
	if (letra.equals("2121"))
	{
		letratrad = "C";
	}
	if (letra.equals("211"))
	{
		letratrad = "D";
	}
	if (letra.equals("1"))
	{
		letratrad = "E";
	}
	if (letra.equals("1121"))
	{
		letratrad = "F";
	}
	if (letra.equals("221"))
	{
		letratrad = "G";
	}
	if (letra.equals("1111"))
	{
		letratrad = "H";
	}
	if (letra.equals("11"))
	{
		letratrad = "I";
	}
	if (letra.equals("1222"))
	{
		letratrad = "J";
	}
	if (letra.equals("212"))
	{
		letratrad = "K";
	}
	if (letra.equals("1211"))
	{
		letratrad = "L";
	}
	if (letra.equals("22"))
	{
		letratrad = "M";
	}
	if (letra.equals("21"))
	{
		letratrad = "N";
	}
	if (letra.equals("222"))
	{
		letratrad = "O";
	}
	if (letra.equals("1221"))
	{
		letratrad = "P";
	}
	if (letra.equals("2212"))
	{
		letratrad = "Q";
	}
	if (letra.equals("121"))
	{
		letratrad = "R";
	}
	if (letra.equals("111"))
	{
		letratrad = "S";
	}
	if (letra.equals("2"))
	{
		letratrad = "T";
	}
	if (letra.equals("112"))
	{
		letratrad = "U";
	}
	if (letra.equals("1112"))
	{
		letratrad = "V";
	}
	if (letra.equals("122"))
	{
		letratrad = "W";
	}
	if (letra.equals("2112"))
	{
		letratrad = "X";
	}
	if (letra.equals("2122"))
	{
		letratrad = "Y";
	}
	if (letra.equals("2211"))
	{
		letratrad = "Z";
	}
	
	return letratrad;
}
}