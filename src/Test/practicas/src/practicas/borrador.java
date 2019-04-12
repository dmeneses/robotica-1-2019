package practicas;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;

public class borrador {
	
	public static void main(String[] args) 
	{
		int grados = 50;
		double radio = 3;
		double eje = 16;
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
	   //EV3ColorSensor ojitos = new EV3ColorSensor(SensorPort.S4);
	   //float[] muestrasC = new float[ojitos.sampleSize()];
	   
		  // ojitos.fetchSample(muestrasC, 0);
	       //System.out.println("NUmero" + muestrasC[0]);
		double perimetrog = eje * Math.PI;
    	double giro = grados * perimetrog / 360;
    	double perimetro = radio * Math.PI * 2;
    	double gradito = giro * 360 / perimetro;
    	
    	motorB.rotate((int)gradito, true);
    	motorC.rotate((int)-gradito);
    	
     
	}

 }
