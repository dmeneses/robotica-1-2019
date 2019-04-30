import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class CarritoConSensores {

	public static void main(String[] args) {
		// mi carrito 2 motores: declarar 2 variables q representan motores
		EV3LargeRegulatedMotor motor1;
		motor1 = new EV3LargeRegulatedMotor(MotorPort.B);
		
		EV3LargeRegulatedMotor motor2 = new EV3LargeRegulatedMotor(MotorPort.C);
		
		// Mi carrito tiene un touch sensor
		EV3TouchSensor sensorTouch;
		sensorTouch = new EV3TouchSensor(SensorPort.S1);
		
		// le pedimos al sensor Touch que nos pase cualquier
		// informacion que nos sirva para saber si alguien
		// o algo activo el sensor
		SampleProvider muestrasCapturadasTouch  = sensorTouch.getTouchMode();
		
		
		// boolean tiene 2 unicos valores: Si o No, TRUE o FALSE, falso o verdadero, 0 o 1
		boolean sensorTouchDetectoToque = false;
		
		// Mientras el sensor touch no detecte un toque,
		// quiere decir que el valor de sensorTouchDetectoToque es false
		// entonces hago algooooo...
		// esperamos a que ocurra algo
		// espero mientras el valor de sensorTouchDetectoToque sea false
		// cuando cambie a true, me salgo del while (dejo de esperar) 
		// esperar mientras la condicion sea verdad
		while (sensorTouchDetectoToque == false){
			System.out.println("esperando a que pase algo");
			// creamos una contendora para recibir datos del sensor
			float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
			// le pido al sensor lo que haya detectado
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);			
			// analizar datos del sensor
			// Preguntar si el dato enviado por el sensor coincide con un toque
			// touch sensor envia 0 si no hubo toque
			// Preguntar si el valor que me envio el sensor es igual (==) 0
			// if pregunta si algo se cumple o no
			if (datosDelSensor[0] == 0) {
				System.out.println("0 equivale a que no hubo toque");
			}
			// != Preguntar si el valor que me envio el sensor es diferente de 0
			if (datosDelSensor[0] != 0) {
				System.out.println( datosDelSensor[0] + "equivale a que hubo toque");
				sensorTouchDetectoToque = true;
			}
		}
		System.out.println("Deje de espera");
		Button.waitForAnyPress();
		
		// si detectamos que se presiono el touch entonces hacer que
		// el carrito se mueva describiendo un rectangulo de lados
		// 120 cm *  60 cm
		
		if (sensorTouchDetectoToque == true) {
			// describir el rectangulo
			
			
		}
		System.out.println("esperando para cerrar programa");
		Button.waitForAnyPress();
		
		
		
		
		
		
		
		
		
		
	}

}
