import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class caffi2 
{
	public static void main(String args[])	
	{
		/*
 		System.out.println("que salgan las variables!");
		double dis = 30; 
		double per;
		per=2*Math.PI*3;		
		double grados= 720*dis/per;
		Motor.B.rotate((int)-grados,true);
		Motor.C.rotate((int)- grados);
	    */
	    //final 
//}
//{ public staticvoid main(String()args);
        //1. mantener el robot vivo esperando 
        //   que el pulsador sea presionado
	    //2. detectar distancia usando sensor ultrasonico
	    //3. avanzar distancia apropiada para presionar el
	    //   pulsador del robot siguiente
		EV3UltrasonicSensor ojos;
		ojos = new EV3UltrasonicSensor (SensorPort.S4);
		float[] muestras = new float[ojos.sampleSize()];
		while(true)
		{
		   ojos.fetchSample(muestras, 0);
		   
	       double distancia = muestras[0] * 100;//en cm 
	       System.out.println("distancia: " + muestras[0]);
	      
		}
	}
}