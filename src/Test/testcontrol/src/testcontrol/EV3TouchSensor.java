package testcontrol;

public class EV3TouchSensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EV3TouchSensor sensor = EV3Touchsensor(SensorPort.S4);
		
		SampleProvider sp = sensor.getTouchMode();
		
		public TouchSensor(Port port){
		sensor = new EV3TouchSensor(port);	
		sp =sensor.getTouchMode();
		}
		public boolean isTouched() {
			float[] sample= new float [sp.sampleSize()];
			sp.fetchSample(sample, 0);
			if(sample[0]==0)
				return false;
			else
				return true;
		}
		public void close(){
			sensor.close();
		
		
		
		
		
		
	}

}
