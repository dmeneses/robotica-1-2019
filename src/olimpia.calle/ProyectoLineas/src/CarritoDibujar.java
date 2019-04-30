import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class CarritoDibujar {
 
	public static void main(String[] args) {
		int numeroTramos = 2;
		double distanciaLapizArriba = 20; // 20 centimetros
		double distanciaLapizAbajo = 30; // 30 centimetros
		EV3LargeRegulatedMotor rueda1;
		EV3LargeRegulatedMotor rueda2;
		EV3LargeRegulatedMotor lapiz;
		rueda1 = new EV3LargeRegulatedMotor(MotorPort.A);
		rueda2 = new EV3LargeRegulatedMotor(MotorPort.A);
		lapiz = new EV3LargeRegulatedMotor(MotorPort.A);
		System.out.println("Presione cualquier boton para empezar");
		Button.waitForAnyPress();
		/// todo mi codigo
		int gradosRuedasLapizArriba = 0;
		int gradosRuedasLapizAbajo = 0;
		int gradosLapiz = 100; // gradosLapiz * (-1)
		
		double diametroRueda = 5.5; // DATO: de gomita a gomita en centimetros
		double circunferencia = Math.PI * diametroRueda;
		// 1. Calcular grados Lapiz arriba usando distanciaLapizArriba
		double numeroDeRotaciones = distanciaLapizArriba / circunferencia;
		gradosRuedasLapizArriba = (int)(numeroDeRotaciones * 360);
		
		
		// 2. Calcular grados Lapiz abajo usando distanciaLapizAbajo
		numeroDeRotaciones = distanciaLapizAbajo / circunferencia;
		gradosRuedasLapizAbajo = (int)(numeroDeRotaciones * 360);
		
		// gradosRuedasLapizArriba distinto de 0
		// gradosRuedasLapizAbajo distinto de 0
		
		// 3. Subir Lapiz - Comenzar con Lapiz Arriba
		lapiz.rotate(gradosLapiz);
		lapiz.stop();
		int tramosTerminados = 0;
		while (tramosTerminados < numeroTramos) {
			// 1. Lapiz Abajo
			lapiz.rotate((-1)*gradosLapiz);						
			// 2  Avanzar
			rueda1.rotate(gradosRuedasLapizAbajo, true);
			rueda2.rotate(gradosRuedasLapizAbajo);
			
			// 3  Lapiz Arriba
			lapiz.rotate(gradosLapiz);
			
			// 4  Avanzar
			rueda1.rotate(gradosRuedasLapizArriba, true);
			rueda2.rotate(gradosRuedasLapizArriba);
			
			// cuento para poder salir del while
			tramosTerminados = tramosTerminados + 1;
		}
		
		// 4. Lapiz Abajo
		lapiz.rotate((-1)*gradosLapiz);
		lapiz.stop();
		/// todo mi codigo
		rueda1.close();
		rueda2.close();
		lapiz.close();
		System.out.println("Presione cualquier boton para terminar");
		Button.waitForAnyPress();
		
	}

}
