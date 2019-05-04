package hola;


import Return.Return;
import reset.Reset;
import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Stopwatch;

public class thefish
{		
	
	EV3TouchSensor touchBoton = new EV3TouchSensor(SensorPort.S1);
	float[] muestrasBoton = new float [touchBoton.sampleSize()];
	   
	public int morsecopiado()
	{
		
		Stopwatch cronos = new Stopwatch();
		float[] muestrasTouchBoton = new float[touchBoton.sampleSize()];
		  while(true)
			{

			touchBoton.fetchSample(muestrasTouchBoton, 0);
			 System.out.println("Boton "+muestrasTouchBoton[0]);
			    int presionado=(int)muestrasTouchBoton[0];
			    //antes de presionar
			    cronos.reset();//ponemos el crono en cero
			    while(presionado==1)
			    {
					touchBoton.fetchSample(muestrasTouchBoton, 0);
					 System.out.println("Boton "+muestrasTouchBoton[0]);
					    presionado=(int)muestrasTouchBoton[0];
			    	
			    }
			    //despues de presionar			    
			    int tiempo = cronos.elapsed();//recuperamos el tiempo que estuvo presionado
			    System.out.println("tiempo presionad: "+tiempo);
			    if(tiempo > 1000 && tiempo < 2000)
			    {
			    	System.out.println("rayita");
			    	return 2;
			    }
			    else if(tiempo > 2000)
			    {
			    	System.out.println("fin de letra");
			    	return 3;
			    }
			    else
			    {
			    	System.out.println("punto");
			    	return 1;
			    }
			}
		}
		 
	  }
	



  
		