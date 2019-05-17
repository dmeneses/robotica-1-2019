import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Clase1 {

	public static void main(String[] args) {
		EV3ColorSensor sensorColor= new  EV3ColorSensor(SensorPort.S1);
		EV3UltrasonicSensor ultrasonic= new EV3UltrasonicSensor(SensorPort.S2);
		EV3LargeRegulatedMotor motorA=new  EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorB=new  EV3LargeRegulatedMotor(MotorPort.B);
		
		SampleProvider muestrasCapturadasObstaculo=ultrasonic.getDistanceMode();

		 
		SampleProvider muestrasCapturadasColor=sensorColor.getColorIDMode();
		float [] datosDelSensor= new float[muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor,0);
		float color=datosDelSensor[0];
		System.out.println(color);
		
		
	 
		
		float distanciaAlObstaculo=0;
		while (distanciaAlObstaculo!= Float.POSITIVE_INFINITY){
			float[]datosObstaculo=new float [muestrasCapturadasObstaculo.sampleSize()];
			muestrasCapturadasObstaculo.fetchSample(datosObstaculo,0);
			System.out.println("dato enviado por  sensor = "+ distanciaAlObstaculo);
			
		}
			      
			
		

	}

	 

}
