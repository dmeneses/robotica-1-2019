//import java.util.Timer;

//import lejos.hardware.port.SensorPort;
//import lejos.hardware.sensor.EV3TouchSensor;
//import lejos.robotics.SampleProvider;
//import lejos.utility.Delay;
//import lejos.utility.Stopwatch;


/*public class viernes 

{
	
	Stopwatch strange = new Stopwatch();
	EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
	SampleProvider sp = sensor.getTouchMode();
	boolean botonActivado;
	boolean strangeon = false;
	int tiempo = 0;
	
	
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
			  System.out.println(tiempo);
			  Delay.msDelay(3000);
		  }
	      
		  return tiempo;
	    //}	
	  
   }*/
  
    
//}


