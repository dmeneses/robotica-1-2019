import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class CarroUltrasonico {

	public static void main(String[] args) {
		
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S4);
		//iicializar motores
		EV3LargeRegulatedMotor motorD;
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		System.out.println("esperando a que presione cualquier boton ");
		Button.waitForAnyPress();
		Sound.beepSequence();
		//sensor preparate para sacar fotos
		SampleProvider muestrasCapturadasOjitos = ojitos.getDistanceMode();
		
		float distanciaAlObstaculo = Float.POSITIVE_INFINITY;
		//captura mientras la distancia al obstaculo sea 0
		while(distanciaAlObstaculo == Float.POSITIVE_INFINITY){
			float[] datosOjitos = new float [muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por el sensor ="+ distanciaAlObstaculo);	
		}
		double distanciaCM = distanciaAlObstaculo*100;
		int grados = 0;
		double diametroRueda = 5.5; //de gomita a gomita en cm
		double circunferencia = Math.PI*diametroRueda;
		double numeroDeRotaciones = distanciaCM /circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		Button.waitForAnyPress();
		Sound.beepSequenceUp();
		// gradosGiro = 400;
		motorD.setSpeed(500);
		motorD.rotate(grados, true);
		motorI.setSpeed(500);
		motorI.rotate(grados);
			
		ojitos.close();
		motorD.close();
		motorI.close();
		Sound.beepSequence();
		Button.waitForAnyPress();
				
			
			}
		
	
		}
		
	

	

