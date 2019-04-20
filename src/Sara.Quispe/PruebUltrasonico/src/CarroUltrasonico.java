import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class CarroUltrasonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar una variable ojitos
		//del tipo de dato UltraSonicSensor
		
	EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S2);
	EV3LargeRegulatedMotor motorB=new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorD=new EV3LargeRegulatedMotor(MotorPort.D);
	 
	
	System.out.println("esperando a que se presione cualquier boton");
	Button.waitForAnyPress();
	Sound.beepSequenceUp();
	 SampleProvider muestrasCapturadasOjitos;
	 muestrasCapturadasOjitos = ojitos.getDistanceMode();
	 
	float distanciaAlObstaculo = 0;
	while (distanciaAlObstaculo != Float.POSITIVE_INFINITY){
		float [] datosOjitos=new float[muestrasCapturadasOjitos.sampleSize()];
		muestrasCapturadasOjitos.fetchSample(datosOjitos,0);
		System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
		
		distanciaAlObstaculo=Float.POSITIVE_INFINITY;
	
		double distanciaCM = distanciaAlObstaculo*100;
		
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaCM/circunferencia;
		grados=(int)(numeroDeRotaciones* 360);
		
	
		int velocidad=200;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		
	}
	ojitos.close();
	motorB.close();
	motorD.close();
	Sound.beepSequenceUp();
	Button.waitForAnyPress();
	
	}

}
