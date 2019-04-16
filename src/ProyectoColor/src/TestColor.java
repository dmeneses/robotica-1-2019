import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;


public class TestColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S1);

		SampleProvider sp = sensor.getColorIDMode();
		String colorconocido;
		while(true){
			float[] sample = new float [sp.sampleSize()];
			sp.fetchSample(sample, 0);
			if (sample[0] == 0){
				colorconocido="rojo";
				}else{
					if (sample[0] == 1){
						colorconocido="verde";
						}else{
							if (sample[0] == 2){
								colorconocido="azul";
								}else{
									colorconocido="amarillo";
								}
						}
					
			
				
					
					
			}
			System.out.println(colorconocido);
			
		}

	}

}
