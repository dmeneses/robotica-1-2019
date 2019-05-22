package cesar;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
public class ModoAtaque {
	
	int empujar1 ;
	int empujar2;
	int sorpresa ;
	int retroceder ;
	double distancia;
	int distancia2 ;
	
	EV3UltrasonicSensor ojos;
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorD;
	
	
	public ModoAtaque()
	
	{
	
	
	 motorA = new EV3LargeRegulatedMotor(MotorPort.A);
	 motorD = new EV3LargeRegulatedMotor(MotorPort.D);
	ojos = new EV3UltrasonicSensor(SensorPort.S3);
	
	}
	
public	void irhaciarobot()
{ 
	
	
	float [] distanciarobot = new float[ojos.sampleSize()];
	
	while (true)
	{
	ojos.fetchSample(distanciarobot,0);
	double distancia = distanciarobot[0]*100;
      distancia2 = (int) (distancia -4);
		
	
	empujar1 =  (int)(distancia2 *360/17);  
	motorA.rotate(-empujar1,true);
	motorD.rotate(-empujar1);
	motorA.setSpeed(300);
    motorD.setSpeed(300);

	
	}
	}
			
			///////////////////////
			
	private void retrocederatacar()
	
	{		
			
	retroceder = 20;
	sorpresa = retroceder * 360/17;
	motorA.rotate(sorpresa,true);
	motorD.rotate(sorpresa);
	
	
	
	empujar2 = ((int) 150 *360/17);
	motorA.rotate(-empujar2,true);
	motorD.rotate(-empujar2);
   
	motorA.setSpeed(900);
    motorD.setSpeed(900);


}
	


}