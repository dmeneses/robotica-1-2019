import java.text.DecimalFormat;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Zumilloo {
	 
	EV3ColorSensor color;
	EV3TouchSensor  sensor;
	EV3TouchSensor  sensorX;
	EV3MediumRegulatedMotor motor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
    EV3UltrasonicSensor sonic;
    EV3UltrasonicSensor eyes;
    
	
	   public Zumilloo()
	   {
		    eyes = new EV3UltrasonicSensor(SensorPort.S1);
		    color = new EV3ColorSensor(SensorPort.S3);
		    sensor = new  EV3TouchSensor(SensorPort.S2);
			sensorX= new  EV3TouchSensor(SensorPort.S4);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.D);
	   }
	public void verCancha(){
		SampleProvider luz = color.getRedMode();
			float[] muestras = new float[luz.sampleSize()];	
			while(true){
				luz.fetchSample(muestras, 0);
				float iluz = muestras[0];
				if (iluz < 0.2 )
				{
					System.out.println("estoy fuera debo entrar");
				}
				else{
					System.out.println("estoy fuera debo entrar");
					Delay.msDelay(1000);
				}
			}
		}  
	public void atacar(int iluz){
		if(iluz < 0.2){
		float[] muestras = new float[eyes.sampleSize()];
     	eyes.fetchSample(muestras, 0);
    	double distancia = muestras[0] * 100;
    	DecimalFormat decimal = new DecimalFormat("0.00");
	    System.out.println("Distance: " + decimal.format(distancia));
    	int D = 0;
        double x = distancia;
        D = (int)(((360*x))/17);
    	motorI.setSpeed(motorI.getMaxSpeed());
    	motorD.setSpeed(motorD.getMaxSpeed());
    	motorI.rotate(D, true);
        motorD.rotate(D);
		}
	}
}








































