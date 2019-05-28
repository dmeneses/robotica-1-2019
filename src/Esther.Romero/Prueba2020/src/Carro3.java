import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Carro3 {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S3);
	EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
	EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S4);
	SampleProvider muestrascapturadasOjitos = ojitos.getDistanceMode();
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

public void avanzar(double distanciaAvance){
	
	double numeroDeRotaciones = distanciaAvance / circunferencia;
	int grados = 0; 
	grados = (int)(numeroDeRotaciones * 360);
	
	int velocidad = 300;
	motorDerecho.setSpeed(velocidad);
	motorDerecho.rotate(grados, true);
	motorIzquierdo.setSpeed(velocidad);
	motorIzquierdo.rotate(grados);
	motorDerecho.stop();
	motorIzquierdo.stop();
	Delay.msDelay(2000);
	
}
public void girar(double grado){
	
	int grados = (int)(grado*4.1);
	if(grados< -0){
		int velocidad = 250;
		motorIzquierdo.setSpeed(velocidad);
		motorIzquierdo.rotate(grados);
		
		Delay.msDelay(2000);
	}
	else{
		grados = grados*(-1);
		int velocidad = 250;
		motorDerecho.setSpeed(velocidad);
		motorDerecho.rotate(grados, true);

		Delay.msDelay(2000);
	}
}

public double detectarObstaculo(){
	double distanciaAlObstaculo=0;
	boolean colorXD = true;
	 while( colorXD == true){
    float[] datosojitos= new float[muestrascapturadasOjitos.sampleSize()];
    muestrascapturadasOjitos.fetchSample(datosojitos, 0);
    distanciaAlObstaculo= datosojitos[0];
    System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
    distanciaAlObstaculo=distanciaAlObstaculo*100;
    if(datosojitos[0]== Float.POSITIVE_INFINITY){
    	motorDerecho.setSpeed(300);
    	motorDerecho.forward();
    	motorIzquierdo.setSpeed(300);
    	motorIzquierdo.forward();
    		Delay.msDelay(3000);
    		
    }
		else{
			
			    muestrascapturadasOjitos.fetchSample(datosojitos, 0);
			    distanciaAlObstaculo= datosojitos[0];
			    System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
			    distanciaAlObstaculo=distanciaAlObstaculo*100;
		    	double distancia=distanciaAlObstaculo-5.8;
		    	int grados1=0;
		    	double numeroderotaciones=distancia/circunferencia;
		    	grados1=(int)(numeroderotaciones*360);
		    	int velocidad2 = 300;
		    	motorDerecho.setSpeed(velocidad2);
		    	motorDerecho.rotate(grados1,true);
		    	motorIzquierdo.setSpeed(velocidad2);
		    	motorIzquierdo.rotate(grados1);
		        motorDerecho.stop();
		        motorIzquierdo.stop();
		        Sound.beepSequenceUp();  	
		        Delay.msDelay(2000);
		        
		        ojitos.close();
		}
	 }
    return distanciaAlObstaculo;
  }

}