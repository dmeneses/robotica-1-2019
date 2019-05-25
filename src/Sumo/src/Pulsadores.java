import lejos.hardware.port.SensorPort;

public class Pulsadores {
	
	Auto Mulan = new Auto();
	TouchSensor sensor1 = new TouchSensor(SensorPort.S2);
	TouchSensor sensor2 = new TouchSensor(SensorPort.S3);
	
	
	
	public void hacerAlgo(){
		boolean estaPresionado = sensor1.isTouched();
		boolean estaPresionado2 = sensor2.isTouched();

		while(true){
			estaPresionado = sensor1.isTouched();
			estaPresionado2 = sensor2.isTouched();
			
		if (estaPresionado==true){
			Mulan.atacarAtras();
		}
		if (estaPresionado2==true){
			Mulan.atacarAtras();
		}

		}	
	}
	
}
