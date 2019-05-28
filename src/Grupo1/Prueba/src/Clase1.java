import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class Clase1 {
    
	public static void main(String[] args) {

		double colorBlanco = 7.0;
		double colorDiferente=2.0;
		double colorNegro = -1.0; 
		Clase2 carrito = new Clase2(); 
		boolean detecteColor = false; 
		float colorDetectado = 0;
		 
		  
		while(detecteColor==false){
			colorDetectado = carrito.detectarColor();
			System.out.println("el color detectado es = " + colorDetectado);
			if (colorDetectado == colorNegro) {
				carrito.avanzar();
				System.out.println("ya avance!!!");
				carrito.Stop();
			}
			colorDetectado = carrito.detectarColor();
			if (colorDetectado == colorBlanco || colorDetectado==colorDiferente) {
				System.out.println("detecte blanco");
				carrito.Stop();
				carrito.vuelta();
 			}
		}
		int distanciaDeEmbestida = 30;
		boolean embestida = false;
		while (embestida == false){
		float distancia = carrito.detectarDistancia();
		if (distancia < distanciaDeEmbestida){
			carrito.ataque();
			//embestida = true;
			
		}
		}
		System.out.println("terminando programa");
		Button.waitForAnyPress();

		/*
		 * boolean detecteSiguiente = false; double distanciaDetectada = 0;
		 * while (detecteSiguiente == false){ distanciaDetectada =
		 * carrito.detectarObstaculo(); detecteSiguiente = true;
		 * carrito.detectarObstaculo();
		 */
	}
}