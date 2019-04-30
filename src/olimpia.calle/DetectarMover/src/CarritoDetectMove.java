import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class CarritoDetectMove {

	public static void main(String[] args) {
		EV3UltrasonicSensor ojitos = 
				new EV3UltrasonicSensor(SensorPort.S1);
		EV3LargeRegulatedMotor motorA = 
				new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorB = 
				new EV3LargeRegulatedMotor(MotorPort.C);
		
		SampleProvider muestrasCapturadasOjitos;
		muestrasCapturadasOjitos = ojitos.getDistanceMode();
		float distanciaObstaculo = Float.POSITIVE_INFINITY;
		// Mientras no tenga un buen valor de distancia repito
		// lo que este dentro del {.....}
		// saldre de la repeticion(while) cuando 
		// el valor de distanciaObstaculo sea distinto de iNfinity
		while(distanciaObstaculo == Float.POSITIVE_INFINITY){
			float[] datosOjitos = 
					new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);		
			distanciaObstaculo = datosOjitos[0];
		}
		// capture un valor que no es infinity
		// avanzar esa distancia --> distanciaObstaculo
		double distanciaCM = distanciaObstaculo*100;
		// calcular los grados a rotar
		int grados = 0; // incognita
		double diametroRueda = 5.5;
		double circunferencia = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaCM / circunferencia;
		grados = (int)(numeroDeRotaciones * 360);
		
		// avanzar
		int velocidad = 500;
		motorA.setSpeed(velocidad);
		motorA.rotate(grados, true);
		motorB.setSpeed(velocidad);
		motorB.rotate(grados);

		ojitos.close();
		motorA.close();
		motorB.close();
		Sound.beepSequence();
		Button.waitForAnyPress();
	}

}
