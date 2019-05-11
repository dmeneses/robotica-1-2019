import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;




public class Rotar {
	
	public static void main(String[] args) {
		UltraSonicSensor ojos = new UltraSonicSensor(SensorPort.S4);
	//while(true) {
		float distancia = ojos.getRange();
		System.out.println(distancia);
		
		
		
		int cm=(int)(distancia*100);
		System.out.println(cm);
		int formula=(int) ((360*cm)/(2*Math.PI*3.35));
		EV3LargeRegulatedMotor motorDerecho =
				new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = 
				new EV3LargeRegulatedMotor(MotorPort.B);
		TouchSensor sensor1 = new TouchSensor(SensorPort.S3);
	
		boolean estaPresionado = sensor1.isTouched();
		System.out.println(estaPresionado);
		while (estaPresionado == false) {
			estaPresionado = sensor1.isTouched();
			//System.out.println("WHILE: " + estaPresionado);
			//Button.waitForAnyPress();
			
			if (estaPresionado == true) {
				motorDerecho.setSpeed(640);
				motorIzquierdo.setSpeed(640);
				//motorDerecho.setAcceleration(000);
				//motorIzquierdo.setAcceleration(000);
				motorDerecho.rotate(formula,true);
			    motorIzquierdo.rotate(formula);
				System.out.println("MOVERSE");
				System.out.println(formula);
				
				//motorDerecho.forward();
				//motorIzquierdo.forward();
				
				// Delay.msDelay();
	
			} else {
				//System.out.println("DETENERSE");
				motorIzquierdo.stop();
				motorDerecho.stop();
				
			}
			
		}
		Button.waitForAnyPress();
	}
}

