import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Motor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double distanciaLapizArriba = 40;
		//double distanciaLapizAbajo = 30;
		EV3LargeRegulatedMotor ruedas1 = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor ruedas2 = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor lapiz = new EV3LargeRegulatedMotor(MotorPort.A);
		System.out.println("presione un boton");
		// realizando el movimiento de los lapices
		int gradosRuedasLapizArriba = 20;
		//int gradosRuedasLapizAbajo = 10;
		int gradosLapiz = 100;
		double diametroRueda = 5.5;
		double circunferencia = Math.PI * diametroRueda;
		double distanciaLapizArriba = 40;
		double numeroDeRotaciones = distanciaLapizArriba / circunferencia;
		gradosRuedasLapizArriba = (int) (numeroDeRotaciones * 360);

		int velocidad = 500;
		ruedas1.setSpeed(velocidad);
		ruedas2.rotate(gradosRuedasLapizArriba, true);
		ruedas1.setSpeed(velocidad);
		ruedas2.rotate(gradosRuedasLapizArriba);

		// 2. Calcular grados Lapiz abajo usando distanciaLapizAbajo
		int gradosRuedasLapizAbajo = 10;
		double diametroRueda1 = 5.5;
		double circunferencia1 = Math.PI * diametroRueda1;
		double distanciaLapizAbajo = 30;
		double numeroDeRotaciones1 = distanciaLapizAbajo / circunferencia1;
		gradosRuedasLapizAbajo = (int) (numeroDeRotaciones1 * 360);

		int velocidad1 = 500;
		ruedas1.setSpeed(velocidad);
		ruedas2.rotate(gradosRuedasLapizAbajo, true);
		ruedas1.setSpeed(velocidad);
		ruedas2.rotate(gradosRuedasLapizAbajo);
		// 3. Subir Lapiz - Comenzar con Lapiz Arriba
		
		lapiz.rotate(gradosLapiz);
		//lapiz.stop();

		int tramosTerminados = 0;
		int numeroTramos = 5;
		while (tramosTerminados < numeroTramos) {
			// 1. Lapiz Abajo
			lapiz.rotate((-1) * gradosLapiz);
			// 2 Avanzar
			ruedas1.rotate(gradosRuedasLapizAbajo, true);
			ruedas2.rotate(gradosRuedasLapizAbajo);

			// 3 Lapiz Arriba
			lapiz.rotate(gradosLapiz);

			// 4 Avanzar
			ruedas1.rotate(gradosRuedasLapizArriba, true);
			ruedas2.rotate(gradosRuedasLapizArriba);

			// cuento para poder salir del while
			tramosTerminados = tramosTerminados + 1;
		

		// 4. Lapiz Abajo
		lapiz.rotate((-1) * gradosLapiz);
		lapiz.stop();
		ruedas1.close();
		ruedas2.close();
		lapiz.close();
		System.out.println("Presione cualquier boton para terminar");
		Button.waitForAnyPress();

	}
}
}