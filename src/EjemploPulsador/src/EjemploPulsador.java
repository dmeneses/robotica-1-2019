import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class EjemploPulsador {

	public static void main(String args[]) {
	   EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S1);
       SampleProvider sp = sensor.getTouchMode();
	   float [] sample = new float[sp.sampleSize()];

       sp.fetchSample(sample, 0);
       
       float valorObtenido = sample[0];

       if (valorObtenido == 0)
           System.out.println("esta presionado");
       else
    	   System.out.println("NO esta presionado");
	}
}
