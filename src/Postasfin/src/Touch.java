import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class Touch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S2);

		SampleProvider sp = sensor .getTouchMode();
		boolean botonActivado;
		boolean timeContando = false;
		int pushtime= 0;
		int time = 0;
		while(true){
			float[] sample = new float [sp.sampleSize()];
			sp.fetchSample(sample, 0);
			if (sample[0] == 0){
				botonActivado = false;
				}else{
			
					botonActivado = true;
					
					
			}
		if (botonActivado  );
			
		}
		

	}


}
