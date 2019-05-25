import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;


public class PruebaUltraSonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SensorUltrasonico ojos = new SensorUltrasonico(SensorPort.S4);
		while(true)
		{
			float distancia = ojos.getRange();
			System.out.println(distancia);
		}

	}

}
