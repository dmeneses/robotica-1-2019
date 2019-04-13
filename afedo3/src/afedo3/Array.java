package afedo3;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;

public class Array 
{
	int distanciafija;
	int[] angulosRojo;
	Pato robot;
	
	public Array()
	{
		distanciafija = 50;
		robot = new Pato(2.5, 12.5);
		angulosRojo = new int[4];
		angulosRojo[0]=270;
		angulosRojo[1]=270;
		angulosRojo[2]=273;
		angulosRojo[3]=246;
	}
	
	public void jugar()
	{
		//recuperar el color del robot (pato)
		int color = robot.detectarColor();
		if(color == 0)//se detecto rojo
		{
			robot.girarGrados(angulosRojo[0]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosRojo[2]);
			robot.avanzarCentimetros(distanciafija);
            robot.girarGrados(angulosRojo[3]);
            int distancia = robot.detectarDistancia();
            robot.avanzarCentimetros(distancia);              
		}
	}
	
	

}
