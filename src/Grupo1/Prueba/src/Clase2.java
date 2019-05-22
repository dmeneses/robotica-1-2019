import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Clase2 {
	EV3ColorSensor sensorColor= new  EV3ColorSensor(SensorPort.S1);
	EV3UltrasonicSensor ultrasonic= new EV3UltrasonicSensor(SensorPort.S2);
	EV3LargeRegulatedMotor motorA=new  EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motorD=new  EV3LargeRegulatedMotor(MotorPort.D);
	
 
	
	public  float detectarColor() {
		SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
		float[] datosDelSensor = new float[muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
		float color = datosDelSensor[0];
		System.out.println("color=" + color);
		 
		return color;
	}

	public void avanzar() {
		
		motorA.forward();
		motorD.forward();
		
		motorA.stop();
		motorD.stop();
		
		/*double distanciaCM = 20;
		int grados = 0;
		double diametroRueda = 5.5;
		double circunferencia = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaCM * circunferencia;
		grados = (int) (numeroDeRotaciones * 360);

		int velocidad = 200;
		motorA.setSpeed(velocidad);
		motorA.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		motorA.stop();
		motorD.stop();*/

	}
	public  void Stop() {
	
		motorA.stop();
		motorD.stop();
	 
		
/*public double detectarObstaculo() {
		
		float distanciaAlObstaculo = 0;

		while (distanciaAlObstaculo == 0) {
			float[] datosOjitos = new float[ultrasonic.sampleSize()];
			 ultrasonic.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
			distanciaAlObstaculo=(distanciaAlObstaculo*100)/2;
		}
			int grados = 0;
			double circunferencia1 = Math.PI * diametroRueda;
			double numeroDeRotaciones = distanciaAlObstaculo / circunferencia1;
			grados = (int) (numeroDeRotaciones * 360);

			int velocidad = 200;
			motorA.setSpeed(velocidad);
			motorA.rotate(grados, true);
			motorD.setSpeed(velocidad);
			motorD.rotate(grados);
			 
		
		 
		return distanciaAlObstaculo;*/


 
}
 
}
