 import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
 
 
public class Pulsadores {

	public static void main(String[] args) {
		EV3TouchSensor touchSensor= new EV3TouchSensor(SensorPort.S3);
		EV3TouchSensor touchSensor1= new EV3TouchSensor(SensorPort.S4);
		
		SampleProvider muestraCapturaTouch = touchSensor.getTouchMode ();
		SampleProvider muestraCapturaTouchito = touchSensor1.getTouchMode ();
		char []morse = new char [200];
		String morse1 = ".";
		String morse2 = "_";
		boolean SensorTouchToque = false;
		while (SensorTouchToque == false){
			System.out.println("esperar a que pase algo");
			float[]datosSensor = new float [muestraCapturaTouch.sampleSize()];
			muestraCapturaTouch.fetchSample(datosSensor, 0);
			System.out.println("muestraCapturaTouch="+muestraCapturaTouch.sampleSize());
			if(datosSensor[0]==1){
				for(int i = 0; 0 <datosSensor.length; i++){
					Button.waitForAnyPress();
					if (datosSensor[i] != 1 && datosSensor[1] != 1){
						System.out.println(morse1);
					}
					else if (datosSensor[i]!= 1 && datosSensor[i] == 1){
						System.out.println(morse2);
					}
				}
			}
			
		}
		
	}

}

