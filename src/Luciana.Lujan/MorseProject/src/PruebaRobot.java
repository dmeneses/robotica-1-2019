import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class PruebaRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EV3TouchSensor Toque = new EV3TouchSensor(SensorPort.S1); 
	SampleProvider  muestras = Toque.getTouchMode();
	boolean touch = false;
	while(touch == false){
		
		
	}
	}
}
