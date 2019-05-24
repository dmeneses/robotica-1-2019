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

public class morse {
	EV3TouchSensor  sensor;
	EV3MediumRegulatedMotor motor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
	SampleProvider sp;
	public morse ()
	{
		sensor = new  EV3TouchSensor(SensorPort.S2);
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		motor = new EV3MediumRegulatedMotor(MotorPort.A);
	}
	public void leerCodigo()
	{
		sp = sensor.getTouchMode();
		boolean BotonActivo;
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
        	if(BotonActivo==true){  
            System.out.println(".");
        	motor.rotate(90, true);
            motor.rotate(90);
        	}
		}
	}
}