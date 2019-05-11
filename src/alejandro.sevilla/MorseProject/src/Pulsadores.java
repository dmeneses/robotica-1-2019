import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;


public class Pulsadores {
	
	EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);
	EV3TouchSensor CodigoMorse = new EV3TouchSensor(SensorPort.S3);
	TouchAdapter Adaptador = new TouchAdapter(CodigoMorse);
	Stopwatch timer = new Stopwatch();
	
	 public boolean pedirDatosAlPulsadorTerminar(){
		 boolean resultado = false;
		 SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();	
		 float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
		 muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);	
		 double datosSensor = datosDelSensor[0];
		 
		 if(datosSensor != 0){
			resultado = true; 
		 }
		 return resultado;		 
	 }
	 
	 char pedirDatosAlPulsadorCodigo(){
		 SampleProvider muestrasCapturadasTouch = CodigoMorse.getTouchMode();	
		 float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
		 muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);	
		 double datosSensor = datosDelSensor[0];
		 
		 char resultado = 0;
		 Delay.msDelay(500);
		 timer.reset();
		 while(Adaptador.isPressed()){
		 }
		 int duracionDelToque = timer.elapsed();
		 if(duracionDelToque >100 || duracionDelToque <0){
			 resultado = '.';
		 }
		 if (duracionDelToque > 500 ){ 		
			 resultado = '-';
		 }
		 if (duracionDelToque == 0 ){
			 resultado = ' ';
		 }
		 return resultado;
	 }
	
	 	
}	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void terminarPrograma(){
		SampleProvider muestrasCapturadasTouch1 = sensorTouch.getTouchMode();
		
		boolean AccionarPulsador1 = false;
		while (AccionarPulsador1 == false){
			float[] datosDelSensor1 = new float[muestrasCapturadasTouch1.sampleSize()];
			muestrasCapturadasTouch1.fetchSample(datosDelSensor1, 0);
		if(datosDelSensor1[0] != 0){
			System.out.println("Codigo Terminado");
		}
		AccionarPulsador1 = true;
		}
		sensorTouch.close();
		}*/

