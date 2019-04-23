import java.text.DecimalFormat;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
public class Robot {
	EV3ColorSensor  sensor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
    EV3UltrasonicSensor eyes;
	public Robot ()
	{
		sensor = new  EV3ColorSensor(SensorPort.S4);
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		eyes = new EV3UltrasonicSensor(SensorPort.S1);
	}
	public void ReconocerColor()
	{
		SampleProvider sp = sensor.getColorIDMode();
	    String Color = null; 
		 while(true){
			    float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		 Color = "Rojo" ;	        	
	        		 rutaR(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==1)
	        	{
	        		 Color = "Verde";
	        		 rutaV(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==2)
	        	{
	        		 Color = "Azul";
	        		 rutaA(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==3)
	        	{
	        		 Color = "Amarillo";
	        		 rutaY(Color);
	        		 leer(Color);
	        	}
                } 
                }
	public void rutaR(String Color)
	{
		        System.out.println(Color);
		        if(Color == "Rojo"){
		        int D = 0;
		        double S = 30;
	            D = (int)((360*S)/17);
		        int G = 20;
	            int PG=(int)(2*Math.PI*12);
	   	        int R = 0;
	   	        R = (int)(((G/2)*360)/PG);
	   	        int G1 = -92;
	   	        int PG1=(int)(2*Math.PI*12);
	   	        int R1 = 0;
	   	        R1 = (int)(((G1/2)*360)/PG1);
	   	        int G2 = 72;
	   	        int PG2=(int)(2*Math.PI*12);
	   	        int R2 = 0;
	   	        R2 = (int)(((G2/2)*360)/PG2);
	            motorI.setSpeed(motorI.getMaxSpeed());
	    	    motorD.setSpeed(motorD.getMaxSpeed());
	    	    motorI.rotate(R, true);
	            motorD.rotate(-R);
	            motorI.rotate(D, true);
	            motorD.rotate(D);
	            motorI.rotate(R1, true);
	            motorD.rotate(-R1);
	            motorI.rotate(D, true);
	            motorD.rotate(D);
	            motorI.rotate(R2, true);
	            motorD.rotate(-R2);
	           }	      
	           }
	public void rutaV(String Color)
	           {
		       System.out.println(Color);
		       if(Color == "Verde"){
		    	   int D = 0;
			        double S = 30;
		            D = (int)((360*S)/17);
			        int G = -50;
		            int PG=(int)(2*Math.PI*12);
		   	        int R = 0;
		   	        R = (int)(((G/2)*360)/PG);
		   	        int G1 = 120;
		   	        int PG1=(int)(2*Math.PI*12);
		   	        int R1 = 0;
		   	        R1 = (int)(((G1/2)*360)/PG1);
		   	        int G2 = -70;
		   	        int PG2=(int)(2*Math.PI*12);
		   	        int R2 = 0;
		   	        R2 = (int)(((G2/2)*360)/PG2);
		            motorI.setSpeed(motorI.getMaxSpeed());
		    	    motorD.setSpeed(motorD.getMaxSpeed());
		    	    motorI.rotate(-R, true);
		            motorD.rotate(R);
		            motorI.rotate(D, true);
		            motorD.rotate(D);
		            motorI.rotate(R1, true);
		            motorD.rotate(-R1);
		            motorI.rotate(D, true);
		            motorD.rotate(D);
		            motorI.rotate(-R2, true);
		            motorD.rotate(R2);
	           }
} 
    public void rutaA(String Color) 
               {
    	       System.out.println(Color);
    	       if(Color == "Azul"){
    	    	   int D = 0;
   		        double S = 30;
   	            D = (int)((360*S)/17);
   		        int G = 70;
   	            int PG=(int)(2*Math.PI*12);
   	   	        int R = 0;
   	   	        R = (int)(((G/2)*360)/PG);
   	   	        int G1 = -100;
   	   	        int PG1=(int)(2*Math.PI*12);
   	   	        int R1 = 0;
   	   	        R1 = (int)(((G1/2)*360)/PG1);
   	   	        int G2 = 30;
   	   	        int PG2=(int)(2*Math.PI*12);
   	   	        int R2 = 0;
   	   	        R2 = (int)(((G2/2)*360)/PG2);
   	            motorI.setSpeed(motorI.getMaxSpeed());
   	    	    motorD.setSpeed(motorD.getMaxSpeed());
   	    	    motorI.rotate(R, true);
   	            motorD.rotate(-R);
   	            motorI.rotate(D, true);
   	            motorD.rotate(D);
   	            motorI.rotate(R1, true);
   	            motorD.rotate(-R1);
   	            motorI.rotate(D, true);
   	            motorD.rotate(D);
   	            motorI.rotate(R2, true);
   	            motorD.rotate(-R2);    	
               }
               }
               public void rutaY(String Color) 
               {
               System.out.println(Color);   
               if(Color == "Amarillo"){
            	   int D = 0;
   		        double S = 30;
   	            D = (int)((360*S)/17);
   		        int G = 20;
   	            int PG=(int)(2*Math.PI*12);
   	   	        int R = 0;
   	   	        R = (int)(((G/2)*360)/PG);
   	   	        int G1 = -92;
   	   	        int PG1=(int)(2*Math.PI*12);
   	   	        int R1 = 0;
   	   	        R1 = (int)(((G1/2)*360)/PG1);
   	   	        int G2 = 72;
   	   	        int PG2=(int)(2*Math.PI*12);
   	   	        int R2 = 0;
   	   	        R2 = (int)(((G2/2)*360)/PG2);
   	            motorI.setSpeed(motorI.getMaxSpeed());
   	    	    motorD.setSpeed(motorD.getMaxSpeed());
   	    	    motorI.rotate(R, true);
   	            motorD.rotate(-R);
   	            motorI.rotate(D, true);
   	            motorD.rotate(D);
   	            motorI.rotate(R1, true);
   	            motorD.rotate(-R1);
   	            motorI.rotate(D, true);
   	            motorD.rotate(D);
   	            motorI.rotate(R2, true);
   	            motorD.rotate(-R2);   	
    }
    }
    public void leer(String Color){
                if(Color != null){
               	float[] muestras = new float[eyes.sampleSize()];
                eyes.fetchSample(muestras, 0);
               	double distancia = muestras[0] * 100;
                DecimalFormat decimal = new DecimalFormat("0.00");
           	    System.out.println("Distance: " + decimal.format(distancia));
           	   	Delay.msDelay(1000);
                       	int D = 0;
                       	int S = 0;
                        double x = distancia;
                        D = (int)(((360*x)-2300)/17);
                       	S = D ;
                       	motorI.setSpeed(motorI.getMaxSpeed());
                       	motorD.setSpeed(motorD.getMaxSpeed());
                       	motorI.rotate(D, true);
                        motorD.rotate(D);
           }
                else{
                	System.out.println(Color = null);
                }
}
}