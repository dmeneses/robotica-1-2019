import java.text.DecimalFormat;

import javax.sound.sampled.Port;

import lejos.robotics.SampleProvider;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.RangeFinder;

public class Ojos implements RangeFinder{
	
	
	EV3UltrasonicSensor sonic;
	SampleProvider sp;
	float[] sample;
	
	public EV3UltrasonicSensor (){
		
		sonic = new EV3UltrasonicSensor(port);
		sp = sonic.getDistanceMode();
		sample = new float[sp.sampleSize()];
		
	}

	@Override
	public float getRange() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float[] getRanges() {
		// TODO Auto-generated method stub
		return null;
	}   
        }
		
	
	
	

