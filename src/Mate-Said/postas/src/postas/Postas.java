package postas;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
public class Postas {
	public static void main(String[] args) {

        EV3TouchSensor sensor = new  EV3TouchSensor(SensorPort.S4);
        SampleProvider sp = sensor.getTouchMode();
        boolean BotonActivo;
        while(true){
        	float[] sample = new float [sp.sampleSize()];
        	sp.fetchSample(sample, 0);
        	if(sample[0]==0)
        	{
        		BotonActivo = false;
        	}
        	else
        	{
        		BotonActivo = true;
        	}
        }
    }
}
