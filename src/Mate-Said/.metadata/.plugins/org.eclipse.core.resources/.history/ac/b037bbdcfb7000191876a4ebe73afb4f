import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Stopwatch;

	public class Morse {
		EV3TouchSensor  sensor;
		EV3MediumRegulatedMotor motor;
		EV3LargeRegulatedMotor motorD;
	    EV3LargeRegulatedMotor motorI;
	    Stopwatch timer;
		SampleProvider sp;
		public Morse ()
		{
			sensor = new  EV3TouchSensor(SensorPort.S2);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.A);
			timer = new Stopwatch();
		}
		public void leerCodigo()
		{
			sp = sensor.getTouchMode();
			boolean BotonActivo;
			boolean contador = false;
			int apretar=0;
			while(true){
	        	float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		BotonActivo = false;
	        	}
	        	else
	        	{
	        		BotonActivo = true;
	        	}
	        	System.out.println(BotonActivo); 
	        	if(BotonActivo && contador){
	        	timer.reset();
	        	contador= true;
	            }
	        	if(BotonActivo && contador){
	        	apretar = timer.elapsed();
	           	System.out.println(apretar);
	            contador = false;
	          }
          }
     } 
}


