import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;


public class SensorColor {
      EV3ColorSensor colorcito=new EV3ColorSensor(SensorPort.S1);
      float[] sample;
      
      SensorColor(){
    	 
    	  colorcito.setFloodlight(false);
    	  sample=new float[colorcito.sampleSize()];
      }
      int obtenerColor(){
    	  colorcito.fetchSample(sample, 0);
    	  return (int) sample[0];
      }
}
