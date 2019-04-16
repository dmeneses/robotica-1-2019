
public class PruebaColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		EV3ColorSensor sensor = new EV3TouchSensor(SensorPort.S2);

		SampleProvider sp = sensor.getolorideMode();
		boolean botonActivado;
		while(true){
			float[] sample = new float [sp.sampleSize()];
			sp.fetchSample(sample, 0);
			if (sample[0] == 0){
				botonActivado = false;
				}else{
			
					botonActivado = true;
					
					
			}
			System.out.println(botonActivado);
			
		}

	}

}
