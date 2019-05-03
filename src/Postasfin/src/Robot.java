import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class Robot {
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorC;
	EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S2);
	
	SampleProvider sp = sensor .getTouchMode();
	boolean botonActivado ;
	while(true){
		
		float[] sample = new float [sp.sampleSize()];
		sp.fetchSample(sample, 0);
		if (sample[0] == 0){
			botonActivado = false;
			}else{
				botonActivado = false;
				
		
				botonActivado = true;
				
				
		}
		System.out.println(botonActivado);
		
	}
}
 
}
