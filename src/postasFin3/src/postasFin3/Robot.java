package postasFin3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;


public class Robot {
	EV3LargeRegulatedMotor motorA;
	EV3MediumRegulatedMotor motorD;
	  EV3LargeRegulatedMotor motorC ;
	EV3TouchSensor sensorCodigo;
	EV3TouchSensor sensorTerminar;
	int avanzar;
	int distancia;
	int espacioGuion;
	
	public Robot(int cm)
	{
		 
		 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	    motorC = new  EV3LargeRegulatedMotor(MotorPort.C);     
	     sensorCodigo = new  EV3TouchSensor(SensorPort.S1);
	     sensorTerminar = new  EV3TouchSensor(SensorPort.S3);
	     motorD = new EV3MediumRegulatedMotor(MotorPort.D);
	      avanzar=cm; 
	      distancia = (int)avanzar*360/17;
	}
	public void dibujarPunto() {
		motorD.rotate(70);
		motorD.rotate(-70);
		
		motorA.rotate(distancia,true);
         motorC.rotate(distancia);
		
        
		
	}

	public void dibujarGuion(int avanzar)
	{
		
		motorD.rotate(70);
		//
		espacioGuion=(4*360/17);
		motorA.rotate(espacioGuion,true);
        motorC.rotate(espacioGuion);
        //
        motorD.rotate(-70);
         //
 		motorA.rotate(distancia,true);
          motorC.rotate(distancia);
	}


}

