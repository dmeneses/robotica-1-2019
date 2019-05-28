package cesar;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Acciondetoque 
{
	EV3TouchSensor toqueladoderecho = new EV3TouchSensor(SensorPort.S1);
	EV3TouchSensor toqueladoizquierdo = new EV3TouchSensor(SensorPort.S4);
	private int girarunlado1;
	private int girarunlado2;
	private BaseRegulatedMotor motorA;
	private BaseRegulatedMotor motorD;
   
	public void choquederecho()
	{
		boolean toqueladoderecho = true ;
		if (toqueladoderecho == true )
			
		{
			
			int giro = 5;
			girarunlado1 = giro * 360/17;
			motorA.rotate(-girarunlado1);
			motorD.rotate(0);
			
			
		}
		else
		{
		// sigue peleando
			
		}
		motorA.rotate(200 ,true);
	    motorD.rotate(215);	
	}
	
	public void choqueizquierdo()
	{
		boolean toqueladoizquierdo ;
		if (toqueladoizquierdo = true )
			
		{
			
			int giro = 5;
			girarunlado2 = giro * 360/17;
			motorA.rotate(0);
			motorD.rotate(- girarunlado2);
			
			
		}
		else
		{
		// sigue peleando
    motorA.rotate(215 ,true);
    motorD.rotate(200);
		}

 	
	
	}
}
