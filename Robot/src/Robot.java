import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Robot 
{
	double radio;
	double eje; //6.25
	EV3UltrasonicSensor ojos;
	EV3TouchSensor boton;
	float[] muestrasOjos;
	float[] muestrasBoton;
	
	
	public void avnazarCentimetros(int distancia)
	{
		double perimetro = radio * Math.PI  * 2;
		double pato = distancia * 360 / perimetro;
		Motor.B.rotate((int)pato, true);
		Motor.C.rotate((int)pato);
	}
	
	public int detectarDistancia()
	{
		ojos.fetchSample(muestrasOjos, 0);
		return (int)muestrasOjos[0] * 100;
	}
	
	public int detectarPulsador()
	{
		boton.fetchSample(muestrasBoton, 0);
		return (int)muestrasBoton[0];
	}
	
	public void girarGrados(int grados)
	{
		double perimetrog = eje * Math.PI;
		double giro = grados * perimetrog / 360;
		double perimetro = radio * Math.PI  * 2;
		double gradito = giro * 360 / perimetro;
		
		Motor.B.rotate((int)gradito, true);
		Motor.C.rotate((int)-gradito);
	}

}
