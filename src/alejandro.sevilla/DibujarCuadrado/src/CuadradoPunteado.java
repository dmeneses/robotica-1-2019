import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.utility.Delay;


public class CuadradoPunteado {

	public static void main(String[] args) {
		
		int setSpeed = 200;
		int gradosGiro = 385;
		int lados = 4;
		double distanciaLapizArriba = 5;
		double distanciaLapizAbajo = 5;
		int gradosLapiz = 80;
		int gradosLapizAbajo = -80;
		
		EV3GyroSensor lineaRecta = new EV3GyroSensor(SensorPort.S2);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.A );
		
		System.out.println("toca un boton para empezar");
		Button.waitForAnyPress();
		

		brazo.rotate(gradosLapiz);
		brazo.setSpeed(200);
		int tramosR = 0;
		
		int grados = 0;
		double diametroRueda = 5.5;
		double circunferencia = Math.PI*diametroRueda;
		
		while (tramosR < lados){
			
		
			
			double distanciaAvanzar = distanciaLapizAbajo;
			double numeroDeRotaciones = distanciaAvanzar /circunferencia;
			grados = (int)(numeroDeRotaciones*360);
			
			brazo.rotate(gradosLapizAbajo);
			brazo.setSpeed(setSpeed);
			
			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);

			
			
			brazo.rotate(gradosLapiz);
			brazo.setSpeed(200);

			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
			
			
			brazo.rotate(gradosLapizAbajo);
			brazo.setSpeed(200);
			
			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
		
			
			
			brazo.rotate(gradosLapiz);
			brazo.setSpeed(200);

			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
			
			brazo.rotate(gradosLapizAbajo);
			brazo.setSpeed(200);

			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
			
			
			brazo.rotate(gradosLapiz);
			brazo.setSpeed(200);
			
			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
		
			
			
			brazo.rotate(gradosLapizAbajo);
			brazo.setSpeed(200);

			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
		
			
			
			brazo.rotate(gradosLapiz);
			brazo.setSpeed(200);

			motorD.setSpeed(setSpeed);
			motorD.rotate(grados, true);
			motorI.setSpeed(setSpeed);
			motorI.rotate(grados);
			Delay.msDelay(300);
			
			motorD.rotate(gradosGiro);
			
			motorD.backward();
			motorI.backward();
			
			tramosR = tramosR+1;
			
			
			
		}
		
		motorD.close();
		motorI.close();
		lineaRecta.close();
		System.out.println("toca un boton para terminar");
		Button.waitForAnyPress();
		
		

	}

}
