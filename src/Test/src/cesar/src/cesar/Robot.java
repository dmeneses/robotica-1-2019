package cesar;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Robot {

	EV3ColorSensor luz;
	EV3LargeRegulatedMotor motorA;
	 EV3LargeRegulatedMotor motorD;
	 EV3UltrasonicSensor ojos;
	  int rotacion ;
	 int girar;
	 int retroceder;
	 ModoAtaque atk;
	 
public Robot(){
	motorA = new EV3LargeRegulatedMotor(MotorPort.B);
	  motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	 luz = new EV3ColorSensor(SensorPort.S2);
	 atk = new ModoAtaque();

}
	 

public void buscarEnemigo()
{
	
 
	 rotacion=(int) 180*(815/360);
	 girar = rotacion;
	 motorA.rotate(girar);
	 motorD.rotate(- girar);
	 atk.irhaciarobot();

 
}
	
	 
	 
	 
	 
	 
	public void seguirencancha()
	{
		 
		 
		 
		while(true)
		{
		float[] muestras = null;
		luz.fetchSample(muestras,0);
		float iluz = muestras[0];
		if (iluz < 0.2)
		{
		System.out.println("sigo en cancha");	
		System.out.println(iluz);	
		}
		else
		{
			retroceder = 30 * 360/17;
			motorA.rotate(retroceder,true);
			motorD.rotate(retroceder);
			 motorA.setSpeed(600);
			 motorD.setSpeed(600);
			
			
			
		}
			
		}
	}
	
}
