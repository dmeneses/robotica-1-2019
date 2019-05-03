package afedo3;

import lejos.hardware.motor.Motor; 
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Pato 
{
	//propiedades
	double radio;
	double eje;
	EV3UltrasonicSensor  ojos;
	EV3ColorSensor color;
	float[] muestrasOjos;
	//float[] muestrasBoton;
	float[] muestrasColor;
	EV3TouchSensor boton ;
	
	//constructor
	public Pato(double rad, double ej)
	{
		radio = rad;
		eje =ej;
		color = new EV3ColorSensor (SensorPort.S1);
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
		//boton = new EV3TouchSensor(SensorPort.S1);
		muestrasOjos = new float [ojos.sampleSize()];
		//muestrasBoton = new float[boton.sampleSize()];
		muestrasColor = new float[color.sampleSize()];
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
	
	public void acelerar(int aceleracion)
	{
		Motor.B.setSpeed(aceleracion);
		Motor.C.setSpeed(aceleracion);
	}

	   public int detectarDistancia()
	   {
		   
		ojos.fetchSample(muestrasOjos, 0);
		return (int)(muestrasOjos[0]*100);
	   }
	   /*public int detectarPulsador()
	   {
		   boton.fetchSample(muestrasBoton, 0);
		   return (int)muestrasBoton[0];
	   }*/
	   public void girarGrados(int girarGrados  )
	   
	   {
		   double perimetroG= eje*Math.PI;
		   //regla de tres para obtener
		   //distancia del arco a moverse
		   double giro=   girarGrados*perimetroG/360;
		   //perimetro de la rueda 
		   double perimetro= radio*Math.PI*2.5;
		   //regla de tres para obtener grados
		   
		double grado= giro*360/perimetro;
		   //mover motores 
		 Motor.B.rotate((int) girarGrados, true);
		 Motor.C.rotate((int)- girarGrados);
		 
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
	public int detectarColor() {
		    //float[] muestrasColor = null;
		    // TODO Auto-generated method stub
		    color.fetchSample(muestrasColor, 0);
		    return (int)muestrasColor[0];
		
	}

		
	}
	
	
 
		
	
	
	
