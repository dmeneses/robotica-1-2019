
import java.text.DecimalFormat;

import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Zumilloo {
	 
	EV3ColorSensor color;
	EV3TouchSensor  sensorI;
	EV3TouchSensor  sensorD;
	EV3MediumRegulatedMotor motor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
    EV3UltrasonicSensor sonic;
    EV3UltrasonicSensor eyes;
    SampleProvider sp;
	float[] sample;
	
	   public Zumilloo()
	   {
		    eyes = new EV3UltrasonicSensor(SensorPort.S1);
		    color = new EV3ColorSensor(SensorPort.S3);
		    sensorI = new  EV3TouchSensor(SensorPort.S2);
			sensorD= new  EV3TouchSensor(SensorPort.S4);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.D);
	   }
	  
	public void verCancha(){
	
		
		SampleProvider luz = color.getRedMode();
			float[] muestras = new float[luz.sampleSize()];	
			while(true){
				luz.fetchSample(muestras, 0);
				float iluz = muestras[0];
				if (iluz < 0.2 )
				{
					System.out.println("sigo en la cancha");
					avanzarennegro(5);
					CostadoDerecho();
					CostadoIzquierdo();
					atacar(iluz);
				}
				else{
					
					
					System.out.println("estoy fuera debo entrar");
					Delay.msDelay(0);
					retro(20);
					girar(180);
					atacar(iluz);
					
					
				}
			palanca1();
			}
		} 
	public void palanca1 (){
		motor.setSpeed(motorI.getMaxSpeed());
    	motor.setSpeed(motorD.getMaxSpeed());
		motor.forward();
		motor.forward();
	}
	
	
	public void palanca (){
		motor.setSpeed(motorI.getMaxSpeed());
    	motor.setSpeed(motorD.getMaxSpeed());
		motor.rotate(80);
		motor.rotate(-80);
	}
	
public void retro(int cm){
		
		double radio = 2.8;
		int grados = 360;
		double perimetro = 2 * Math.PI * radio;
		
		int retro = (int) ((cm * grados) / perimetro);
		motorI.rotate(-retro,true);
		motorD.rotate(-retro);
		
		
	}
  public void avanzarennegro (int cm){
	  motorI.setSpeed(motorI.getMaxSpeed());
	  motorD.setSpeed(motorD.getMaxSpeed());
	  motorI.forward();
	  motorD.forward();
	  
  }
 public void retroennegro (int cm){
	  
	  motorI.backward();
	  motorD.backward();
	  
  }
 public void atacar (float iluz){
		float[] muestras = new float[eyes.sampleSize()];
     	eyes.fetchSample(muestras, 0);
    	double distancia = muestras[0] * 100;
       	DecimalFormat decimal = new DecimalFormat("0.00");
	    System.out.println("Distance: " + decimal.format(distancia));
	   	Delay.msDelay(0);
            	motorI.setSpeed(motorI.getMaxSpeed());
            	motorD.setSpeed(motorD.getMaxSpeed());
            	motorI.forward();
                motorD.forward();
            	

 }
 
 
 
public void bajarlavelocidad (int cm){
	 motorI.setSpeed(400);
 	 motorD.setSpeed(400);
	 motorI.forward();
	 motorD.forward();
 }

	
	
	 
	public void avanzar(int cm){
		
		double radio = 2.8;
		int grados = 360;
		double perimetro = 2 * Math.PI * radio;
		
		int Avanzar = (int) ((cm * grados) / perimetro);
		motorI.rotate(Avanzar,true);
		motorD.rotate(Avanzar);
		
		
	}
	
    public void girar(int grados){
		
		double radio = 7.2504;
		double perimetro = 2 * Math.PI * radio;
		double SM = (int)((perimetro * grados) / 360);
		double perimetro1 =  2 * Math.PI * 2.8;
		int girarGrados = (int) ((SM * 360) / perimetro1);
		motorI.rotate(-girarGrados,true);
		motorD.rotate(girarGrados);

		
		
  }

    public void CostadoIzquierdo (){
    	
    	SampleProvider sp = sensorI.getTouchMode();
    	boolean BotonActivo;
        
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
        	System.out.println(BotonActivo);
    
            if(BotonActivo==true){
            	
            	motorI.setSpeed(motorI.getMaxSpeed());
            	motorD.setSpeed(motorD.getMaxSpeed());
        		motorI.forward();
        		motorD.forward();
             }
            else{
            System.out.println(BotonActivo);
            }
}
  public void CostadoDerecho(){
    	
    	SampleProvider sp = sensorI.getTouchMode();
    	boolean BotonActivo;
        
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
        	System.out.println(BotonActivo);
    
            if(BotonActivo==true){
            	motorI.setSpeed(motorI.getMaxSpeed());
            	motorD.setSpeed(motorD.getMaxSpeed());
        		motorI.forward();
        		motorD.forward();
            	

            	
            	
             }
            else{
            System.out.println(BotonActivo);
            }
}
    
	   	
	
}

   












































