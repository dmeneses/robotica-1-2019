import java.util.HashMap;
import java.util.Map;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;



public class traductor

{

	char sim;
	
	String palabra = "";
	
	Map mochila = new HashMap();
	//viernes cosa = new viernes();
	Stopwatch strange = new Stopwatch();
	EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
	EV3TouchSensor sensor2 = new EV3TouchSensor(SensorPort.S1);
	SampleProvider sp = sensor.getTouchMode();
	SampleProvider sp2 = sensor2.getTouchMode();
	boolean botonActivado;
	boolean botonActivado2;
	boolean strangeon = false;
	int tiempo = 0;
	
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
	
	public double medir()
    {
	   //while(true)
	    //{
		  float[] sample = new float [sp.sampleSize()];
		  sp.fetchSample(sample, 0);
		  if (sample[0] == 0)
		  {
			  botonActivado = false;
		  }
		
		  else
		  {
			 botonActivado = true;
		  }  
		
		  if (botonActivado && !strangeon)
		  {
			 strange.reset();
			 strangeon = true;
		  }
		
		  if (!botonActivado && strangeon)
		  {
			  tiempo = strange.elapsed();
			  strangeon = false;
			  //System.out.println(tiempo);
			  //Delay.msDelay(3000);
		  }
	      
		  return tiempo;
		  
	    //}	
	  
  }
	
	
	
	public char traducir()
	{		
	 double t = tiempo;
	 
	  float[] sample2 = new float [sp2.sampleSize()];
	  sp2.fetchSample(sample2, 0);
	  
	   if (sample2[0] == 0)
	   {
		  //botonActivado2 = false;
		   System.out.println(palabra);
		   sample2[0] = 2;
	   }
	
	   else
	   {
		 //botonActivado2 = true;
		   
		   if( t > 1 &&  t <= 500)
	     {
			sim = '.';
			palabra = palabra + sim; 
			tiempo = 0;
			
		 }
		
		if(tiempo >= 500)
		{
			sim = '-';
			palabra = palabra + sim;
			tiempo = 0;
			
			
		}
	   }
	  
	  //if(botonActivado2 == true)
	  //{
	  
	  //}
	 
	  //else
	  //{
		  
		  
		 
	  //}
	  
	  return sim;
	  
	  
	}
	
	
	
	
	
	
	
	
	
	
	
}
