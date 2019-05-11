import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class Carrito2 {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S3);
	EV3UltrasonicSensor ultrasonic = new EV3UltrasonicSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
	double diametroRueda = 5.5;
	
	public float detectarColor(){
		float color=0;
		return color;
		
	}
	
	public void avanzar (double distancia){
		int grados =0;
        double diametroRueda = 5.5; 
		double circunferencia = Math.PI * diametroRueda;
		double distanciaAmoverme = 30;
		double numeroDeRotaciones = distanciaAmoverme /circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		System.out.println(grados);
		
		motorD.setSpeed(500);
		motorD.rotate(grados, true);
		motorI.setSpeed(500);
		motorI.rotate(grados);

		motorD.rotate(360);
		motorD.setSpeed(500);
		motorI.setSpeed(500);
		motorD.rotate(grados, true);
		motorI.rotate(grados);
	}
	public double detectarDistacia1(){
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S1);
		SampleProvider muestraCapturasOjitos;
		 muestraCapturasOjitos = ojitos.getDistanceMode();
		 double distacia = 0;

		 float detectarDistancia= Float.POSITIVE_INFINITY;
		 while( detectarDistancia== Float.POSITIVE_INFINITY){ 
			 float[] datosOjitos =new float[muestraCapturasOjitos.sampleSize()];
			 muestraCapturasOjitos.fetchSample(datosOjitos, 0);
			 detectarDistancia = datosOjitos [0];
		 
			 System.out.println("dato enviado por el sensor ="+ detectarDistancia);}
			 
			 
		
	
		
		
			
			
		}


	private void detectarDistacia() {
		// TODO Auto-generated method stub
		
	}
	
	

}
