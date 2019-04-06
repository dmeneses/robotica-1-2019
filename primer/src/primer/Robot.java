package primer;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.Motor;
public class Robot 
{
	//propiedades
	double radio;
	EV3UltrasonicSensor ojos;
	float [] muestrasOjos;
	EV3TouchSensor boton ;
	float [] muestrasBoton;	
	
	//metodos
	public void avanzar (int distancia)
	{		
		double perimetro = radio* Math.PI*2;
//regla de tres
		double avan= distancia *360/perimetro;
		//mover motores 
		Motor.B. rotate((int) avan, true);
		Motor.C.rotate((int)-avan);
	}
	
	public int detectardistancia()
	{
		ojos.fetchSample (muestrasOjos, 0);
		return (int) muestrasOjos [0] *100;
	}
	
	public int detectarPulsador()
	{
		boton.fetchSample (muestrasBoton,0);
		return (int) muestrasBoton [0];	
	}
	
	public void girarGrados (int grados)
	{
					
	}			
}
				
		
		
		
	
	
	
	
	
	














