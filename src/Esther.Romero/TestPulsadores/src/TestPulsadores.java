import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;


public class TestPulsadores {

	public static void main(String[] args) {
		EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S1);
		TouchAdapter touchAdaptador = new TouchAdapter(touch);
		Stopwatch timer= new Stopwatch();
		int tiempoDeReaccion = 0;
		char morse=' ';
		
		Delay.msDelay(600);
		System.out.println(" empieza ");
		while (touchAdaptador.isPressed()) {
		}
		tiempoDeReaccion = timer.elapsed();
		System.out.println("tiempoDeReaccion"+ tiempoDeReaccion);
		if(tiempoDeReaccion<=200){
			morse='.';
			System.out.println(morse='.');
		}
		else if(tiempoDeReaccion>=200){
			morse='_';
			System.out.println(morse='_');
		}
		timer.reset();
		Button.waitForAnyPress();
		while(!touchAdaptador.isPressed()){
		}
		tiempoDeReaccion = timer.elapsed();
		System.out.println("tiempoDeReaccion" + tiempoDeReaccion);
	}

}