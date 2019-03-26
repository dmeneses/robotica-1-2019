package primer;
import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.Motor;
public class postas 
{
	public static void main(String args [])
	{	
		EV3TouchSensor boton;
		EV3UltrasonicSensor ojos ;
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
		boton = new EV3TouchSensor(SensorPort.S2);
		float[]muestras=new float[ojos.sampleSize()];
		float[]muestrasBoton=new float[boton.sampleSize()];
		while(true)
		{
			ojos.fetchSample(muestras, 0);
			boton.fetchSample(muestrasBoton, 0);
			double distancia =muestras[0]*100;
			System.out.println("Distancia "+distancia);
			System.out.println("Boton "+muestrasBoton[0]);
			
			double x =distancia;
			double rotar=360*(x/(2.45*Math.PI*2));
			
			int presionado = (int)muestrasBoton[0];//presionado en 1
			if(presionado == 1)
			{Motor.B.rotate((int)rotar,true);
			Motor.C.rotate((int)rotar);
			
				
			}
			
		}	
		
		
	}
}
