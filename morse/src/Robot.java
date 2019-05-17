import lejos.hardware.motor.*;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.internal.ev3.EV3MotorPort;




public class Robot 
{	
	//propiedades
	double radio;
	double eje;
	EV3UltrasonicSensor ojos;
	float[]muestrasOjos;
	//float[] muestrasBoton;
	float[]muestrasColor;
	//EV3TouchSensor boton;
	EV3ColorSensor color;
	//constructor
	EV3MotorPort marcador;
	public Robot(double rad, double ej)
	{
		radio= rad;
		eje=ej;
		//ojos=new EV3UltrasonicSensor(SensorPort.S3);
		//boton= new EV3TouchSensor(SensorPort.S4);
		//color= new EV3ColorSensor(SensorPort.S4);
		//muestrasOjos = new float[ojos.sampleSize()];
		//muestrasBoton = new float [boton.sampleSize()];
		//muestrasColor = new float [color.sampleSize()];
		//color.setFloodlight(C);
		//marcador= new EV3MotorPort (SensorPort.D);
	}
	//metodos
	public void avanzarCentimentros (int distancia)
	{
		double perimetro= radio*Math.PI*2;//regla de tres
		double pato= distancia*360/perimetro;		
		Motor.B.rotate((int)pato, true);
		Motor.C.rotate ((int)pato);
	}

	public int detectarDistancia ()
	{
	
		ojos.fetchSample(muestrasOjos,0);
		return (int)(muestrasOjos[0]*100);//cm
	
	}

	public void levantarMarcador()
	
	{ 
		Motor.D.rotate (45);
	}
public void bajarMarcador()
	
	{ 
	Motor.D.rotate (-45);
	}
	
	public int detectarColor()
	{	
			color.fetchSample(muestrasColor, 0);
			return (int)muestrasColor[0];
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
		Motor.B.rotate((int)-gradito, true);
		Motor.C.rotate((int)gradito);
		
	}
	public void acelerar(int aceleracion)
	{
		Motor.B.setSpeed(100);
		Motor.B.setAcceleration(50);
		Motor.C.setSpeed(100);
		Motor.C.setAcceleration(50);
	}
	
	public void dibujarTriangulo(int lado)
	{ 
		  avanzarCentimentros(lado);
		  girarGrados(120);
		 avanzarCentimentros(lado);
		  girarGrados(120);
		  avanzarCentimentros(lado);
		  girarGrados(120); 
		  
	}
}
	
	
	
			
