package afedo3;

import lejos.hardware.motor.Motor; 
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Pato 
{
	//propiedades
	double radio;
	double eje;
	EV3UltrasonicSensor  ojos;
	float[] muestrasOjos;
	float[] muestrasBoton;
	EV3TouchSensor boton ;
	//constructor
	public Pato(double rad, double ej)
	{
		radio = rad;
		eje =ej;
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
		boton = new EV3TouchSensor(SensorPort.S1);
		muestrasOjos = new float [ojos.sampleSize()];
		muestrasBoton = new float[boton.sampleSize()];
	}
	//metodos
	public void avanzarCentimetros(int distancia)
	{
		 double perimetro= radio*Math.PI*2;
         //regla de tres	
		 double grados= distancia*360/perimetro;
         //mover motores 
		 System.out.println("Grados "+ grados);
		 Motor.B.rotate((int)grados, true);
		 Motor.C.rotate((int)grados);
	}

	   public int detectarDistancia()
	   {
		   
		ojos.fetchSample(muestrasOjos, 0);
		return (int)muestrasOjos[0]*100;
	   }
	   public int detectarPulsador()
	   {
		   boton.fetchSample(muestrasBoton, 0);
		   return (int)muestrasBoton[0];
	   }
	   public void girarGrados(int grados)
	   {
		   double perimetroG= eje*Math.PI;
		   //regla de tres para obtener
		   //distancia del arco a moverse
		   double giro= grados*perimetroG/360;
		   //perimetro de la rueda 
		   double perimetro= radio*Math.PI*2;
		   //regla de tres para obtener grados
		   
		double grado= giro*360/perimetro;
		   //mover motores 
		 Motor.B.rotate((int)grados, true);
		 Motor.C.rotate((int)-grados);
		   
	   }
	   
	   public void dibujarTriangulo(int lado)
	   {
		   avanzarCentimetros(lado);
		   girarGrados(270);
		   avanzarCentimetros(lado);
		   girarGrados(270);
		   avanzarCentimetros(lado);
		   girarGrados(273);
		   
		   
		   
		  
	   }
	
	}

