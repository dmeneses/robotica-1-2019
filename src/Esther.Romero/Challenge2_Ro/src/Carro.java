import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Carro {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S3);
	EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S4);
	EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
	double diametroRueda = 5.5;
	double circunferencia = Math.PI * diametroRueda;
	
	public float detectarColor(){
		
		SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
		float[] datosDelSensor = new float[muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
		float color = datosDelSensor[0];
		System.out.println("color = " + color);
		return color;
	}
	
	public double detectarObstaculo(){
		
		SampleProvider muestrasCapturadasOjitos;
		muestrasCapturadasOjitos = ojitos.getDistanceMode();
		
		double  detectarObstaculo = 0;
		while( detectarObstaculo != Float.POSITIVE_INFINITY){
		float[] datosOjitos = new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);		
			detectarObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor =" 
					+ detectarObstaculo);
			
			return detectarObstaculo;
		}
	}
	
	public void avanzar (double distanciaFijaRecorrida){
		
		double numeroDeRotaciones1 = distanciaFijaRecorrida / circunferencia;
		int grados1 = 0; 
		grados1 = (int)(numeroDeRotaciones1 * 360);
		
		int velocidad = 200;
		motorDerecho.setSpeed(velocidad);
		motorDerecho.rotate(grados1, true);
		motorIzquierdo.setSpeed(velocidad);
		motorIzquierdo.rotate(grados1);
		motorDerecho.stop();
		motorIzquierdo.stop();
		Delay.msDelay(2000);
	} 
	
	public void girar(int gradosGiro){
		
		motorIzquierdo.rotate(gradosGiro);
		
		if(  gradosGiro < 0 ){
			
			motorDerecho.rotate(gradosGiro);
			
		}
	}
}
