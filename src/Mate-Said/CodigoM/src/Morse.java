import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;
import java.util.ArrayList;
import java.util.HashMap;

	public class Morse {
		EV3TouchSensor  sensor;
		EV3TouchSensor  sensorX;
		EV3MediumRegulatedMotor motor;
		EV3LargeRegulatedMotor motorD;
	    EV3LargeRegulatedMotor motorI;
	    Stopwatch timer;
		SampleProvider sp;
		SampleProvider spX;
		HashMap morse;
		String morsex;
		ArrayList<String> listaMorse;
		public Morse ()
		{
			sensor = new  EV3TouchSensor(SensorPort.S2);
			sensorX= new  EV3TouchSensor(SensorPort.S4);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.D);
			timer = new Stopwatch();
			morse = new HashMap();
			morsex = "";
			listaMorse = new ArrayList<String>();
			
			morse.put(".-","a");
			morse.put("-...","b");
			morse.put("-.-.","c");
			morse.put("-..","d");
			morse.put(".","e");
			morse.put("..-.","f");
			morse.put("--.","g");
			morse.put("....","h");
			morse.put("..","i");
			morse.put(".---","j");
			morse.put("-.-","k");
			morse.put(".-..","l");
			morse.put("--","m");
			morse.put("-.","n");
			morse.put("---","o");
			morse.put(".--.","p");
			morse.put("--.-","q");
			morse.put(".-.","r");
			morse.put("...","s");
			morse.put("-","t");
			morse.put("..-","u");
			morse.put("...-","v");
			morse.put(".--","w");
			morse.put("-..-","x");
			morse.put("-.--","y");
			morse.put("--..","z");
		}
		public void leerCodigo()
		{
			sp = sensor.getTouchMode();
			spX = sensorX.getTouchMode();
			boolean BotonActivo;
			boolean BotonActivoX;
			boolean contador = false;
			int apretar=0;
			while(true){
	        	float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	float[] sampleX = new float [spX.sampleSize()];
	        	spX.fetchSample(sampleX, 0);
	        	if(sample[0]==0)
	        	{
	        		BotonActivo = false;
	        	}
	        	else
	        	{
	        		BotonActivo = true;
	        	} 
	        	if(sampleX[0]==0)
	        	{
	        		BotonActivoX = false;
	        	}
	        	else
	        	{
	        		BotonActivoX = true;
	        	} 
	        	if(BotonActivo && !contador){
	        	timer.reset();
	        	contador= true;
	            }
	        	if(!BotonActivo && contador){
	        	apretar = timer.elapsed();
	        	introducirCodigo(apretar);
	           	System.out.println(apretar);
	           	Delay.msDelay(1000);
	            contador = false;
	            }
	        	if(BotonActivoX == true)
	        	{
	        	for(String i: listaMorse){ 
	        	String traduccion = "";
	        	String respuesta = "";
	        	traduccion = (String) morse.get(i);
	        	respuesta = respuesta + traduccion;
	        	System.out.println(traduccion + i);
	        	Delay.msDelay(1000);
	        	escribirmorse(i);
	        	}
	        	}
  }
 }
		public void escribirmorse(String letra){
			for(int i=0;i<letra.length();i++){
				char e = letra.charAt(i);
			
				if (e == '.'){ 	
					dibujarpunto();
					}
					else if (e == '-'){
					dibujarguion();
					}
					else{
				    dibujarespacio();
					}
			}
		}
		public void introducirCodigo(int apretar)
    	{
			if(apretar > 0 && apretar <=1000)
        	{
        	System.out.println(".");
        	morsex = morsex + "."; 
        	Delay.msDelay(100);
        	}
        	else if(apretar > 1000 && apretar <= 3000)
        	{
        	System.out.println("-");
        	morsex = morsex + "-"; 
        	Delay.msDelay(100);
        	}
        	else if(apretar > 3000 || apretar <= 10000)
        	{
        	System.out.println(" ");
        	listaMorse.add(morsex);
        	Delay.msDelay(100);
        	morsex = "";
    }
  }
		public void dibujarpunto(){
            motorI.rotate(60, true);
			motorD.rotate(60);
			motor.rotate(-90);
			motor.rotate(90);
			motorI.rotate(180, true);
			motorD.rotate(180);
		}
		public void dibujarguion(){
			motorI.rotate(60, true);
			motorD.rotate(60);
			motor.rotate(-90);
			motorI.rotate(360, true);
			motorD.rotate(360);
			motor.rotate(90);
		}
		public void dibujarespacio(){
			motorI.rotate(360, true);
			motorD.rotate(360);
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	