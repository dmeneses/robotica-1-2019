import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Zumillo {

	public static void main(String[] args) {
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S2);
		SampleProvider luz = color.getRedMode();
		float[] muestras = new float[luz.sampleSize()];
		
		while(true){
			
			luz.fetchSample(muestras, 0);
			float iluz = muestras[0];
			
			
			if (iluz < 0.2 )
			{
			
				System.out.println("sigo en la cancha");
				System.out.println(iluz);
			}
			else{
				System.out.println("estoy fuera debo entrar");
				Delay.msDelay(1000);
			}
			
		}
				

	}

}
