import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class Robot {

	public boolean pedirDatosAlPulsadorTerminar() {

		EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);

		SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();
		boolean sensorTouchDetectoToque = false;
		while (sensorTouchDetectoToque == false) {
			float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);
			if (datosDelSensor[0]==0);{
				
				//System.out.println("0 equivale a que no hubo toque");
			}
			
			if(datosDelSensor[0]!= 0){
				System.out.println(datosDelSensor[0]+"equivale a que hubo un toque");
				sensorTouchDetectoToque=true;
				
			}
		}
			
			System.out.println("deje de esperar");
				Button.waitForAnyPress();
		
				 
				if(sensorTouchDetectoToque==true){
					int 
					
					String caracter = "_";
					
				}		
				return false;
	}
 	public char pedirDatosAlPulsadorCodigo() {
		 
		return 0;
	}
}
