import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Acciones 
{
	double radio = 3;
	double eje = 16;
	EV3UltrasonicSensor vision = new EV3UltrasonicSensor(m)
    EV3ColorSensor ojito;
    float[] muestrasV;
    float[] muestrasC;
    int distancia;
    int color;
    public void girar(int grados)
    {
    	double perimetrog = eje * Math.PI;
    	double giro = grados * perimetrog / 360;
    	double perimetro = radio * Math.PI * 2;
    	double gradito = giro * 360 / perimetro;
    	
    	Motor.B.rotate((int)gradito, true);
    	Motor.C.rotate((int)-gradito);
    	
    }
    
    public void avanzar(int distancia)
    {
    	double perimetro = radio * Math.PI * 2;
    	double grados = distancia * 360 / perimetro;
    	
    	Motor.B.rotate((int)grados, true);
    	Motor.C.rotate((int)grados);
    }
    
    public int detectarDistancia()
    {
    	vision.fetchSample(muestrasV, 0);
    	distancia = (int)muestrasV[0] * 100;
    	return distancia;
    }
    
    public int detectarColor()
    {
    	ojito.fetchSample(muestrasC, 0);
    	color = (int)muestrasC[0] + 0;
    	return color;
    	
    }
    
    

}
