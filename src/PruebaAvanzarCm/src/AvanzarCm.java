import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.Button;

public class AvanzarCm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.D);
		TouchSensor sensor1 = new TouchSensor ( SensorPort.S1);
	
		
		double angulos;
		double cm;
		boolean estaPresionado = sensor1.isTouched();
		angulos = (360*10)/(2*Math.PI*(28/10));
		
	while(estaPresionado = sensor1.isTouched()){ 
			
			estaPresionado = sensor1.isTouched();
			if (estaPresionado==true){
				motorDerecho.rotate((int) angulos, true);
				motorIzquierdo.rotate((int) angulos);
				
		
			}
			else{
				motorDerecho.stop();
				motorIzquierdo.stop();		
				

				
			}	
			
		}
		


		
	}
	

}
