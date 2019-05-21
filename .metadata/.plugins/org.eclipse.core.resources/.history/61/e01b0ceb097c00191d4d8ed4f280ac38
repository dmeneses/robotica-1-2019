
import lejos.hardware.motor.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.internal.ev3.EV3MotorPort;
import lejos.robotics.SampleProvider;




public class robosumito 
{	
	//propiedades
	double radio;
	double eje;
	EV3UltrasonicSensor ojos;
	float[]muestrasOjos;
	//float[] muestrasBoton;
	float[]muestrasColor;
	SampleProvider luz;
	//EV3TouchSensor boton;
	EV3ColorSensor color;
	//constructor
	public robosumito(double rad, double ej)
	{
		radio= rad;
		eje=ej;
		ojos=new EV3UltrasonicSensor(SensorPort.S1);
		color= new EV3ColorSensor(SensorPort.S2);
		luz = color.getRedMode();
		muestrasOjos = new float[ojos.sampleSize()];
		muestrasColor = new float [luz.sampleSize()];
		//color.setFloodlight(C);
	}
	//metodos
	public void avanzarCentimentros (int distancia)
	{
		double perimetro= radio*Math.PI*2;//regla de tres
		double pato= distancia*360/perimetro;		
		Motor.D.rotate((int)pato, true);
		Motor.A.rotate ((int)pato);
	}

	public int detectarDistancia ()
	{
	
		ojos.fetchSample(muestrasOjos,0);
		return (int)(muestrasOjos[0]*100);//cm
	
	}

	
	public int detectarLuz()
	{	
			luz.fetchSample(muestrasColor, 0);
			return (int)(muestrasColor[0]*100);
	}
	
	public void girarGrados (int grados)
	{
		double perimetrog0= eje*Math.PI;
		//regla de tre para obtener
		//distancia del arco moverse
		double giro= grados*perimetrog0/360;
		//perimetro de la rueda
		double perimetro= radio*Math.PI*2;
		//regla de tres para obtener grados
		double gradito= giro*360/perimetro;
		//mover motores
		Motor.D.rotate((int)-gradito, true);
		Motor.A.rotate((int)gradito);
		
	}
	public void acelerar(int aceleracion)
	{
		Motor.D.setSpeed(200);
		Motor.D.setAcceleration(100);
		Motor.A.setSpeed(200);
		Motor.A.setAcceleration(100);
		
		}
	public void girarOjitosDerecha()
		
		{ 
		Motor.B.rotate (45);
		}
			public void girarOjitosIzquierda()
	
			{ 
				Motor.B.rotate (-45);
			}
	
}
	
	



	
	
	
	
	
	
			

			

