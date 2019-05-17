package robozumo;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Acciones {
	EV3ColorSensor ojito = new EV3ColorSensor(SensorPort.S4);
	SampleProvider luz = ojito.getRedMode();
	
	int color;
	 float[] muestras = new float[luz.sampleSize()];
	 
	   public int detectarColor()
	    {
	    	  while(true)
	    	  {
	    		  luz.fetchSample(muestras, 0);
	    		  float iluz = muestras[0];
	    		  
	    		  if (iluz < 0.2)
	    		  {
	    			  System.out.println("sigo en la cancha");
	    			  System.out.println(iluz);
	    		  }
	    		  else
	    		  {
	    			  System.out.println("estoy apunto de perder");
	    			  Delay.msDelay(1000);
	    		  }
	    	  
	    	 
	    	
	    }
	    }
}
