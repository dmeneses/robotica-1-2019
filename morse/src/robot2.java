import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
 
//import lejos.hardware.sensor.EV3TouchSensor;
//import stopwatch.
import lejos.utility.Stopwatch;

//package morse;

//public void reset()

public class robot2 
{
	double telegrafo; 
	String pal = "....*---*.-..*.-";
	String h = "....";
	String o = "---";
	String l= " .-..";
	String a= ".-";
	public static void main (String[]args)
	       {
		Stopwatch relog = new Stopwatch ();
	/* System.out.println("hola");*/
		String morse= "saludo";
		System.out.pri ntln("largo: " + morse.length());
	    for (int x=0;x<morse.length();x++)
	        System.out.println("Caracter " + x + ": " + morse.charAt(x));
	    String pal = "....*---*.-..*.-";
	    //for (int x=0;x<pal.length();x++)
	    	int x = 0;
	    	while(x<pal.length())
	    			
	    	{
	    		System.out.println("Caracter " + x + ": " + pal.charAt(x));
	    		x = x + 1;
	    	}
	        
	   System.out.println(morse.charAt(3));
	
	EV3TouchSensor boton;
	boton = new EV3TouchSensor (SensorPort.S4);
	
	float[] muestrasBoton = new float[boton.sampleSize()];
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
   	   System.out.println(tiempo );
   	   Button.waitForAnyPress()
       }
	}
}