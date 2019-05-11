import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Carro {
	
	EV3UltrasonicSensor detectorDeDistancia = new EV3UltrasonicSensor(SensorPort.S4);
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.C);
	double diametroRueda = 5.5;
	int velocidad = 300;
	int infinity = 15;
	int gradosInfinity = 0;
public float detectarColor(){
	
	SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
	float[] datosDelSensor = new float [muestrasCapturadasColor.sampleSize()];
	muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
	float color = datosDelSensor[0];
	System.out.println("color= "+color);	
	return color;	
}
public void detectarObstaculo(){
	SampleProvider muestrasCapturadasOjitos = detectorDeDistancia.getDistanceMode();
	float distanciaAlObstaculo = Float.POSITIVE_INFINITY;
	while(distanciaAlObstaculo == Float.POSITIVE_INFINITY){
		float[] datosOjitos = new float [muestrasCapturadasOjitos.sampleSize()];
		muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
		distanciaAlObstaculo = datosOjitos[0];
		System.out.println("dato enviado por el sensor ="+ distanciaAlObstaculo);	
	}
	/*boolean avanzarInfinty = false;
	while(avanzarInfinty == false){
		double circunferencia = Math.PI*diametroRueda;
		double numeroDeRotaciones = infinity /circunferencia;
		gradosInfinity = (int)(numeroDeRotaciones*360);
		motorD.setSpeed(velocidad);
		motorD.rotate(gradosInfinity, true);
		motorI.setSpeed(velocidad);
		motorI.rotate(gradosInfinity);	
		if(distanciaAlObstaculo != Float.POSITIVE_INFINITY){
			avanzarInfinty = true;	
		}*/
		double distanciaObs= distanciaAlObstaculo*100;
		int grados = 0;
		double diametroRueda = 5.5; 
		double circunferencia1 = Math.PI*diametroRueda;
		double numeroDeRotaciones1 = distanciaObs /circunferencia1;
		grados = (int)(numeroDeRotaciones1*340);
		Sound.beepSequenceUp();
		motorD.setSpeed(velocidad);
		motorD.rotate(grados, true);
		motorI.setSpeed(velocidad);
		motorI.rotate(grados);		
	}
	/*double distanciaObs= distanciaAlObstaculo*100;
	int grados = 0;
	double diametroRueda = 5.5; 
	double circunferencia = Math.PI*diametroRueda;
	double numeroDeRotaciones = distanciaObs /circunferencia;
	grados = (int)(numeroDeRotaciones*340);
	Sound.beepSequenceUp();
	motorD.setSpeed(velocidad);
	motorD.rotate(grados, true);
	motorI.setSpeed(velocidad);
	motorI.rotate(grados);	}*/	
		
	

public void girar(int gradosGiro){	
	motorD.rotate(gradosGiro);
	motorD.setSpeed(velocidad);	
}	
public void avanzar(double ditancia){
	int grados = 0;
	double circunferencia = Math.PI*diametroRueda;
	double numeroDeRotaciones = ditancia /circunferencia;
	grados = (int)(numeroDeRotaciones*360);
	System.out.println("grados");
	motorD.setSpeed(velocidad);
	motorD.rotate(grados, true);
	motorI.setSpeed(velocidad);
	motorI.rotate(grados);
	Delay.msDelay(2000);
}
}
