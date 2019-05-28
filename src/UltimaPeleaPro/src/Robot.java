
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Delay;
import lejos.utility.Delay;
import lejos.utility.Delay;
import lejos.utility.Delay;
import lejos.utility.Delay;



public class Robot {
	EV3LargeRegulatedMotor motorA;
	EV3MediumRegulatedMotor motorD;
	  EV3LargeRegulatedMotor motorC ;
	EV3ColorSensor sensorCodigo;
	//EV3ColorSensor derecho;
	//EV3ColorSensor izquierdo;
	
	SampleProvider sp;
	float[] muestras;
	
	
	public Robot()
	{
		motorD = new  EV3MediumRegulatedMotor(MotorPort.D);
		 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
	    motorC = new  EV3LargeRegulatedMotor(MotorPort.C);     
	     sensorCodigo = new  EV3ColorSensor(SensorPort.S3);	
	    // derecho = new  EV3ColorSensor(SensorPort.S4);	
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
				//palancal();
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
	
		public void dibujarPunto() {
			motorD.rotate(140);
			//motorD.rotate(-70);
			
			//public void palancal()
	 //public void palancal()
		/*int subir = (10*360/17  );
		
		int bajar =	(10*360/17);	
		while (true)
			
		 	motorD.rotate(bajar);
		    //Delay.msDelay(3000);
		    //motorD.rotate(subir);
		 
	}*/
  }
}





