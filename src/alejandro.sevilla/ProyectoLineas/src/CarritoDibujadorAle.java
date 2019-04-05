import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;



public class CarritoDibujadorAle {

	public static void main(String[] args) {
		
		int numeroDeTramos = 2;
		double distanciaLapizArriba = 20;
		double distanciaLapizAbajo = 30;
		int gradosLapiz = 60;
		int gradosLapizAbajo = -60;
		
		
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.A );
		
		System.out.println("toca un boton para empezar");
		Button.waitForAnyPress();
		
		int tramosRecorridos = 0;
		
		while (tramosRecorridos < numeroDeTramos){
			
			Button.waitForAnyPress();
			brazo.rotate(60);
			brazo.rotate(-60);
			
			double distanciaAvanzar = distanciaLapizAbajo;
			int grados = 0;
			double diametroRueda = 5.5;
			double circunferencia = Math.PI*diametroRueda;
			double numeroDeRotaciones = distanciaAvanzar /circunferencia;
			grados = (int)(numeroDeRotaciones*360);
			
			brazo.rotate(gradosLapizAbajo);
			brazo.setSpeed(800);
			
			motorD.setSpeed(300);
			motorD.rotate(grados, true);
			motorI.setSpeed(300);
			motorI.rotate(grados);
			
			double distanciaAvanzarAbajo = distanciaLapizArriba;
			int grados1 = 0;
			double diametroRueda1 = 5.5;
			double circunferencia1 = Math.PI*diametroRueda;
			double numeroDeRotaciones1 = distanciaAvanzarAbajo /circunferencia;
			grados1 = (int)(numeroDeRotaciones*360);
			
			Button.waitForAnyPress();
			
			brazo.rotate(gradosLapiz);
			brazo.setSpeed(800);
			
			motorD.setSpeed(300);
			motorD.rotate(grados, true);
			motorI.setSpeed(300);
			motorI.rotate(grados);
			
			tramosRecorridos = tramosRecorridos+1;
			
		}
			
		
		motorD.close();
		motorI.close();
		System.out.println("toca un boton para terminar");
		Button.waitForAnyPress();
		
		
		
		}
		
	

	}


