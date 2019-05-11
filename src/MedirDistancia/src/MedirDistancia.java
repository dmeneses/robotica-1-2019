import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;

public class MedirDistancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NBOTOM
		TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
		boolean estaPresionado = sensor1.isTouched();
		System.out.println(estaPresionado);
		// MOTORES
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(
				MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(
				MotorPort.D);
		// ultrasonico
		UltraSonicSensor ojos = new UltraSonicSensor(SensorPort.S4);
       boolean variables = true;  
    
		double perimetro = 2 * Math.PI * 2.8;
		int cont = 0;
		
		//
		
		while (variables) {
			
		float distancia = ojos.getRange() * 100;
			System.out.println(distancia);
			estaPresionado = sensor1.isTouched();
			    if (estaPresionado == true) {
					motorDerecho.setSpeed(700);
					motorIzquierdo.setSpeed(700);
					motorDerecho.rotate((int) (360 * distancia / perimetro), true);
					motorIzquierdo.rotate((int) (360 * distancia / perimetro));

					cont = cont + 1;
					if(cont == 3)
					{
					variables = false;
						
					}
					
					
			    }
	
		}

	}
}