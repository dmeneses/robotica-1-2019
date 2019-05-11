import lejos.ev3.tools.SensorPanel;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Carroultrasonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EV3LargeRegulatedMotor motorDerecho= new EV3LargeRegulatedMotor(MotorPort.C);
     EV3LargeRegulatedMotor motorIzquierdo= new EV3LargeRegulatedMotor(MotorPort.B);
     EV3GyroSensor EV3GyroSensor = new EV3GyroSensor(SensorPort.S4);
	 
     
		// declarar una variable ojitos 
		// del tipo de dato UltraSonicsensor 
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S1);
		System.out.println("esperando a que presione cualquier boton");
		Button.waitForAnyPress();
		Sound.beepSequenceUp();
		// sensor ojitos preparate para mandar datos 
		SampleProvider muestraCapturasOjitos;
		 muestraCapturasOjitos = ojitos.getDistanceMode();
		 
		
		 float distanciaALObstaculo = Float.POSITIVE_INFINITY;
		 //capturar datos mientras que la distancia al obstaculo sea 0 
		 while(distanciaALObstaculo == Float.POSITIVE_INFINITY){ 
			 float[] datosOjitos =new float[muestraCapturasOjitos.sampleSize()];
			 muestraCapturasOjitos.fetchSample(datosOjitos, 0);
			 distanciaALObstaculo = datosOjitos [0];
		 
			 System.out.println("dato enviado por el sensor ="+ distanciaALObstaculo);
			 
			 

			 
			 
			
			 
				 
				 //capturar un valor que no es infinity
			 //avanzar esta ditancia -- distanciaALObstaculo double distanciaCM = distanciaALObstaculo*100;
			 //calcular los grados al rotar 
			  double distanciaCM = distanciaALObstaculo*100;
			 if( distanciaALObstaculo!= Float.POSITIVE_INFINITY){ 
				 int grados =0; //incognita
			     double diametroRueda = 5.5; // de gomita a gomita en centimetros 
				 double circunferencia = Math.PI * diametroRueda;
				 double numeroDeRotaciones = distanciaCM /circunferencia;
				grados = (int)(numeroDeRotaciones*360);
				System.out.println(grados);
				
		        
				
				motorDerecho.rotate(grados, true);
				
				motorIzquierdo.rotate(grados); 
			 }}
				 ojitos.close();
				 motorDerecho.close();
				 motorIzquierdo.close();
				 Sound.beepSequence();
				 Button.waitForAnyPress();
				 
				 EV3GyroSensor.close();
			 }
		 }


	
						 
						 
						 
						 
			 
			 
		 
	

	
	


