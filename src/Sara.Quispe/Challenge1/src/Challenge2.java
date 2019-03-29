import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S2);
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);
		Sound.beepSequenceUp();
		Button.LEDPattern(9);
		
		SampleProvider toque = sensorTouch.getTouchMode();
		float valorTouch = 0;
		while (valorTouch == 0) {
			System.out.println("esperando a que pase algo");
			float[] datosDelSensor = new float[toque.sampleSize()];
			toque.fetchSample(datosDelSensor, 0);
			valorTouch = datosDelSensor[0];
		}

		if (valorTouch != 0) {
			
			Sound.beepSequenceUp();
			Sound.beepSequenceUp();
			

			SampleProvider muestrasCapturadasOjitos;
			muestrasCapturadasOjitos = ojitos.getDistanceMode();

			float distanciaAlObstaculo1 = Float.POSITIVE_INFINITY;
			while (distanciaAlObstaculo1 == Float.POSITIVE_INFINITY) {

				float[] datosOjitos = new float[muestrasCapturadasOjitos.sampleSize()];
				muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
				distanciaAlObstaculo1 = datosOjitos[0];
				System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo1);

				if (distanciaAlObstaculo1 != Float.POSITIVE_INFINITY) {

					double distanciaCM = distanciaAlObstaculo1 * 100;

					int grados;
					double diametroRueda = 5.5;
					double circunferencia = Math.PI * diametroRueda;
					double numeroDeRotaciones = distanciaCM / circunferencia;
					grados = (int) (numeroDeRotaciones * 360);

					motorB.rotate(grados, true);

					motorC.rotate(grados);
					motorB.stop();
					motorC.stop();
					Delay.msDelay(2000);
					motorB.close();
					motorC.close();
				}
					
					else{
						double distanciaCM = distanciaAlObstaculo1 * 100;

						int grados;
						double diametroRueda = 5.5;
						double circunferencia = Math.PI * diametroRueda;
						double numeroDeRotaciones = distanciaCM / circunferencia;
						grados = (int) (numeroDeRotaciones * 360);

						motorB.rotate(grados, true);

						motorC.rotate(grados);
						motorB.stop();
						motorC.stop();
						
						
					}
					
					
				}

			}

		
		sensorTouch.close();
		ojitos.close();

		Sound.beepSequenceUp();

	}

}
