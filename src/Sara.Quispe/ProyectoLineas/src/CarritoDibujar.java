import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;


public class CarritoDibujar {

	public static void main(String[] args) {
		int numeroTramos=6;
		double distanciaLapizArriba=30;
		double distanciaLapizAbajo=20;		
		  
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);

		 
		Button.LEDPattern(3);
		
		Sound.beepSequence();
		 
		  	 
		int tramos=4;
		while(tramos<6){
		tramos=tramos+1;
		
		
		motorA.rotate(-100,true);
		
		//double distanciaMover=30;
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaLapizArriba/circunferencia;
		grados=(int)(numeroDeRotaciones* 360);
		
		int velocidad=300; 
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
 
		motorA.rotate(100,true);
  
  		//double distanciaMover1=20;
		int grados1=0;
		double diametroRueda1=5.5;
		double circunferencia1=Math.PI* diametroRueda1;
		double numeroDeRotaciones1=distanciaLapizAbajo/circunferencia1;
		grados1=(int)(numeroDeRotaciones1* 360);
	 
		int velocidad1=300;
		motorB.setSpeed(velocidad1);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad1);
		motorD.rotate(grados1);
	
		motorA.rotate(100*-1,true);
		Sound.beepSequence();
		}
 		 
		motorB.stop();
		motorD.stop();
		motorA.stop();
		
		motorB.close();
		motorD.close();
		motorA.close();
		
		
 	 
		 }

}
