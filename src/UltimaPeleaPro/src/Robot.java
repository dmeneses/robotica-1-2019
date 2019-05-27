
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class Robot {
	EV3LargeRegulatedMotor motorA;
	EV3MediumRegulatedMotor motorD;
	  EV3LargeRegulatedMotor motorC ;
	EV3ColorSensor sensorCodigo;
	SampleProvider sp;
	float[] muestras;
	
	
	public Robot()
	{
		 
		 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	    motorC = new  EV3LargeRegulatedMotor(MotorPort.C);     
	     sensorCodigo = new  EV3ColorSensor(SensorPort.S3);	     
	     motorD = new EV3MediumRegulatedMotor(MotorPort.D);
	     sp = sensorCodigo.getRedMode();
	     muestras = new float[sp.sampleSize()];
	     motorA.setSpeed(800);
			motorA.forward();
			
			motorC.setSpeed(800);
			motorC.forward();
	     
	}
	public void pelear() {
		while (true){
			sp.fetchSample(muestras,0);
			float luz= muestras[0];
			if (luz<0.2)
			{
				avanzar();
			}
			else {
				defensa();
				
			}
		}
		
        
		
	}

	private void defensa() {
		motorA.rotate(800,true);
		motorC.rotate(800);
		giroCompleto();
		
		
		
	}
	private void avanzar() {
		motorA.backward();
		motorC.backward();
		
	}
	public void giroCompleto()
	{
		motorA.rotate(-1270,true);
		motorC.rotate(1270);
		
	}
	public void palanca (float frontal){
		motor .set Speed(motorb.getMaxSeed());
		
	}


}

