import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class caffi2 
{
	public static void main(String args[])	
	{
		
 		System.out.println("que salgan las variables!");
	    
	    //final 
//}
//{ public staticvoid main(String()args);
        //1. mantener el robot vivo esperando 
        //   que el pulsador sea presionado
	    //2. detectar distancia usando sensor ultrasonico
	    //3. avanzar distancia apropiada para presionar el
	    //   pulsador del robot siguiente
		EV3UltrasonicSensor ojos;
		ojos = new EV3UltrasonicSensor (SensorPort.S3);
		float[] muestras = new float[ojos.sampleSize()];
		
		EV3TouchSensor boton;
		boton = new EV3TouchSensor (SensorPort.S4);
		float[] muestrasBoton = new float[boton.sampleSize()];
		while(true)
		{
		   ojos.fetchSample(muestras, 0);
		   boton.fetchSample(muestrasBoton, 0);
	       double distancia = muestras[0] * 100;//en cm 
	       System.out.println("distancia: " + muestras[0]);
	       System.out.println("boton: " + muestrasBoton[0]);
	       double pulsado=(muestrasBoton [0]);
	       if(pulsado==1){double per;
			per=2*Math.PI*2.5;		
			double grados= 360*distancia/per;
			Motor.B.rotate((int)grados,true);
			Motor.C.rotate((int) grados,true);
	      break;}
	       
	      
	       
	       
			//double distancia= if() [ojos.sampleSize()];
			
		}
		System.out.println("ya se acabo :v");
		Button.waitForAnyPress();
	}
}