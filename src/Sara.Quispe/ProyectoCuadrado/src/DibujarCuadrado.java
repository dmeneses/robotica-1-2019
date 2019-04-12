import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class DibujarCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroTramos=1;
		double distanciaLapizArriba=8;
		double distanciaLapizAbajo=10;		
	
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
		
		System.out.println("Presione un boton para iniciar");
		Button.waitForAnyPress();
		
		int num =1;
		while (num<=6){
			System.out.println(num);
			num++;
		
		
		motorA.rotate(-110,true);
		
		 
		double distanciaMover=1;
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaMover/circunferencia;
		grados=(int)(numeroDeRotaciones* 360);
		
		int velocidad=100; 
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		
		motorA.rotate(110,true);
		
		int grados1;
		double diametroRueda1=5.5;
		double circunferencia1=Math.PI* diametroRueda1;
		double numeroDeRotaciones1=distanciaLapizArriba/circunferencia1;
		grados1= (int)(numeroDeRotaciones1* 360);
		
		int velocidad1=300; 
		motorB.setSpeed(velocidad1);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad1);
		motorD.rotate(grados1);
		
		motorA.rotate(-110,true);
		
		int grados2;
		double diametroRueda2=5.5;
		double circunferencia2=Math.PI* diametroRueda1;
		double numeroDeRotaciones2=distanciaLapizAbajo/circunferencia2;
		grados1= (int)(numeroDeRotaciones2* 360);
		
		int velocidad2=300; 
		motorB.setSpeed(velocidad2);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad2);
		motorD.rotate(grados1);
		 
		motorA.rotate(110,true);
		
		int grados3;
		double diametroRueda3=5.5;
		double circunferencia3=Math.PI* diametroRueda3;
		double numeroDeRotaciones3=distanciaLapizArriba/circunferencia3;
		grados1= (int)(numeroDeRotaciones3* 360);
		
		int velocidad3=300; 
		motorB.setSpeed(velocidad3);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad3);
		motorD.rotate(grados1);
		}
		
		 
	}

}