import lejos.hardware.Button;


public class Pruebas {

	public static void main(String[] args)
	{
		Telegrafo telegrafo1;
		int t = 1;
		
		telegrafo1 = new Telegrafo();
		String letra = "";
		while(t==1)
		{
		
		int simbolo = telegrafo1.insertarmorse();
		
		System.out.println("Sim: " + simbolo);
		
		letra = letra + "" + simbolo;
		
		Button.waitForAnyPress();
		
		
		if (simbolo == 3)
		{
			System.out.println("Letra: " + letra);
			
			t=2;
		}
		Button.waitForAnyPress();
		/*
		simbs 
		
		0 .
		1 .
		2 .
		3 
		4 -

		palabrasimbs
		
		"... -"
		*/
		}
	}
	

}
