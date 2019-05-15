import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
 
//import lejos.hardware.sensor.EV3TouchSensor;
//import stopwatch.
import lejos.utility.Stopwatch;

//package morse;

//public void reset()

public class robot2 
{
	///double telegrafo; 
	//String pal = "....*---*.-..*.-";
	/*String h = "....";
	String o = "---";
	String l= " .-..";
	String a= ".-" ;
	String espacio= "*";*/
	public static void main (String[]args)
	       {
		Stopwatch relog = new Stopwatch ();
	 //System.out.println("hola");
		//String morse= "hola";
		String traduccion= "";
		//System.out.println("largo: " + morse.length());
	   
	    //String pal = "....*---*.-..*.-*";
	    /*fo r (int x=0;x<pal.length();x++)
	    	
	    	int x = 0;
	    	while(x<pal.length())	    			
	    	{
	    		System.out.println("Caracter " + x + ": " + pal.charAt(x));
	    		x = x + 1;
	    	}
	      */  
	   //System.out.println(morse.charAt(3));
		Robot robot1;
		robot1= new Robot(3, 12.310);
		int distancia;
	EV3TouchSensor boton;
	boton = new EV3TouchSensor (SensorPort.S4);
	
	float[] muestrasBoton = new float[boton.sampleSize()];
	String pal1 = "";
	while(true)
	{
		relog.reset();
		boton.fetchSample(muestrasBoton, 0);
		double pulsado=(muestrasBoton [0]);
		
		while (pulsado==1)
		{
			boton.fetchSample(muestrasBoton, 0);
			pulsado=(muestrasBoton [0]);
		}
		
 	   int tiempo = relog.elapsed ();
 	  boolean puntito=tiempo<1000 && tiempo>100;   
 	  boolean espacio= tiempo>1000 && tiempo<2000;
 	  boolean linea= tiempo>2000;
 	  
 	   if (puntito)
 	   {
 		   pal1 = pal1 + ".";
 		  System.out.println("punto");
 	   }
 	   if (linea)
 	  
 	   {
 		   pal1 = pal1 + "-";
 		  System.out.println("linea");
 	   }
 	   if (espacio)
 	   {
 		  pal1 = pal1 + "*";
 		  System.out.println("espacio");
 	   }   
 	   System.out.println(tiempo );
   	   //pal1 = ".../--.-/-."
   	   int boti = Button.waitForAnyPress();
   	   if(boti == Button.ID_ENTER)
   	   {
   		   break;
   	   }
    }
	System.out.println("resultado "+pal1);
	Button.waitForAnyPress();
	
	String letraMorse = "";
	String traduccionLetra = "";
	for (int x=0;x<pal1.length();x++)
    {
		if(pal1.charAt(x) == '*')
		{
			System.out.println("aste");
			if(letraMorse.equals("...."))
			{
				traduccionLetra = traduccionLetra + "h";
			}			
			if(letraMorse.equals("---"))
			{
				traduccionLetra = traduccionLetra + "o";
			}			
			if(letraMorse.equals(".-.."))
			{
				traduccionLetra = traduccionLetra + "l";
			}			
			if(letraMorse.equals(".-"))
			{
				traduccionLetra = traduccionLetra + "a";
			}			
			if(letraMorse.equals(".-."))
			{
				traduccionLetra = traduccionLetra + "r";
			}			
			if(letraMorse.equals("-..."))
			{
				traduccionLetra = traduccionLetra + "b";
			}			
			if(letraMorse.equals("-"))
			{
				traduccionLetra = traduccionLetra + "t";
		
			}
			if(letraMorse.equals(".."))
			{
				traduccionLetra = traduccionLetra + "i";
			}			
			if(letraMorse.equals("-.-."))
			{
				traduccionLetra = traduccionLetra + "c";
			}			




			letraMorse = "";//falta un espacio
		}
		else
		{
			letraMorse = letraMorse + pal1.charAt(x);
		}
    }
	System.out.println("traduccion "+traduccionLetra);
	Button.waitForAnyPress();
	
	for (int x=0;x<pal1.length();x++)
	{
		if(pal1.charAt(x) == '.')
		{ 
			robot1.bajarMarcador();
			//robot1.avanzarCentimentros(2);
			robot1.levantarMarcador();
			robot1.avanzarCentimentros(2);
		
		}
	if(pal1.charAt(x) == '-')
		{
		robot1.bajarMarcador();
		robot1.avanzarCentimentros(5);
		robot1.levantarMarcador();
		robot1.avanzarCentimentros(3);
		
	}
	if(pal1.charAt(x) == '*')
	{
		robot1.avanzarCentimentros(3);
		
		
	}
	}
	
		
	
	
	  
	    }
	}
