import lejos.hardware.Button;


public class Pruebas {

	public static void main(String[] args)
	{
		Letra letra1;
		String letra = "";
		String palabra = "";
		String traduccion = "";
		letra1 = new Letra(1);
		int t = 1;
		Robot robot;
		robot = new Robot(2.75,13.6); //11.35
		
		
		letra = letra1.insertarletra();
		palabra = letra + "3";
		System.out.println(letra);
		System.out.println("p =" + palabra);
		
		traduccion = letra1.traducirletra();
		System.out.println(traduccion);
		
		System.out.println("Siguiente");
		
		while(t==1)
		{
			
		letra = letra1.insertarletra();
		palabra = palabra + letra + "3";
		System.out.println(letra);
		System.out.println("p =" + palabra);
		
		traduccion =  traduccion + letra1.traducirletra();
		System.out.println(traduccion);
		
		System.out.println("Siguiente");
		
			int boton = Button.waitForAnyPress();
			if(boton == Button.ID_RIGHT)
				{
					t=2;
				}
		}
		Button.waitForAnyPress();
		System.out.println(traduccion);
		
		
		for(int i=0; i<palabra.length(); i++)
		{
			char let = palabra.charAt(i);
			System.out.println(i + ": " + let );
			if(let == '1')
			{
				//robot.subirbajar(70);
				robot.subirbajar(55);
				robot.subirbajar(-55);
				robot.avanzarcm(3);
				
			}
			if(let == '2')
			{
				robot.subirbajar(55);
				robot.avanzarcm(5);
				robot.subirbajar(-55);
				robot.avanzarcm(5);
				
			}
			if(let == '3')
			{
				//robot.subirbajar(70);
				robot.avanzarcm(5);
			//robot.subirbajar(-80);
				
			}
		}
		
		//robot.subirbajar(55);
		System.out.println(traduccion);
		Button.waitForAnyPress();
	}
	

}
