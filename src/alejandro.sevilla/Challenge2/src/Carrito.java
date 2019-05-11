import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.*;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
public class Carrito {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.C);
	double diametroRueda = 5.5;
	int velocidad = 300;

	
	
	
	
	
	//detectarColor es un metodo o accion
	public  float detectarColor(){
		SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
		float[] datosDelSensor = new float [muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
		float color = datosDelSensor[0];
		System.out.println("color= "+color);	
		return color;
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
		
	
	public void girar(int gradosGiro){
		
		
		motorD.rotate(gradosGiro);
		motorD.setSpeed(velocidad);
		
		
		
	}	
	
		
		
	}


