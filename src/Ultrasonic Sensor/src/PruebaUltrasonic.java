import lejos.hardware.port.SensorPort;


public class PruebaUltrasonic {
	public static void main(String[]args){
		UltraSonicSensor ojos = new UltraSonicSensor(SensorPort.S4);
		while(true) {
			float distancia = ojos.getRange();
			System.out.println(distancia);
			
		}
	}

}
