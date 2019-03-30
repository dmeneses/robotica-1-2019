import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Imagine1 
{
     public static void main(String args[]) {
	
     
  
    EV3UltrasonicSensor ojos ;
    ojos = new EV3UltrasonicSensor(SensorPort.S2);
    float []muestras = new float[ojos.sampleSize()];
    
    EV3TouchSensor pulsador ;
    pulsador = new EV3TouchSensor(SensorPort.S1);
    float []muestrasPulsador = new float[pulsador.sampleSize()];
    System.out.println("Listo");
    while(true)
    {
	    pulsador.fetchSample(muestrasPulsador, 0);	
	    
	    System.out.println( "Pulsador" +muestrasPulsador[0] );
	    ojos.fetchSample(muestras, 0);	
	    
	    double distancia = muestras[0]*100;	    	   
	  
	    System.out.println("Distancia" +  muestras[0] );
	    
	    double grados = distancia * 20.70; 
	    Motor.B.setSpeed(750);
	    Motor.C.setSpeed(750);
	    Motor.B.setAcceleration(850);
	    Motor.C.setAcceleration(850);
	    if(muestrasPulsador[0] == 1)
	    {	
	      Motor.B.rotate((int)grados, true);
	      Motor.C.rotate((int)grados);
	    }	    
       }
      }  
    }

