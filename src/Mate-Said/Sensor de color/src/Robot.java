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
		        double perimetro = 2.8*Math.PI*2;
				double S = 30; 
				int D = 0;
				D= (int)(S*360/perimetro);
		        int G = 20;
	            double PG=(15*Math.PI);
	            double Gir = G*PG/360;
	            double PL = 2.5*Math.PI*2;
	         	int R = 0;
	   	        R = (int)(Gir*360/PL);
	   	        int G1 = -90;
	   	        int PG1=(int)(15*Math.PI);
	   	        double Gir1 = G1*PG1/360;
	            double PL1 = 2.5*Math.PI*2;
	   	        int R1 = 0;
	   	        R1 = (int)(Gir1*360/PL1);
	   	        int G2 = 70;
	   	        int PG2=(int)(15*Math.PI);
	   	        double Gir2 = G2*PG2/360;
	            double PL2 = 2.5*Math.PI*2;
	   	        int R2 = 0;
	   	        R2 = (int)(Gir2*360/PL2);
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
		        double perimetro = 2.8*Math.PI*2;
			    double S = 30; 
			    int D = 0;
			    D= (int)(S*360/perimetro);
			    int G = -50;
		        double PG=(15*Math.PI);
		        double Gir = G*PG/360;
		        double PL = 2.5*Math.PI*2;
		       	int R = 0;
		   	    R = (int)(Gir*360/PL);
		   	    int G1 = 120;
		   	    int PG1=(int)(15*Math.PI);
		   	    double Gir1 = G1*PG1/360;
		        double PL1 = 2.5*Math.PI*2;
		   	    int R1 = 0;
		   	    R1 = (int)(Gir1*360/PL1);
		   	    int G2 = -70;
		   	    int PG2=(int)(15*Math.PI);
		   	    double Gir2 = G2*PG2/360;
		        double PL2 = 2.5*Math.PI*2;
		   	    int R2 = 0;
		   	    R2 = (int)(Gir2*360/PL2);
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
    public void rutaA(String Color) 
               {
    	       System.out.println(Color);
    	       if(Color == "Azul"){
    	    	double perimetro = 2.8*Math.PI*2;
   			    double S = 30; 
   			    int D = 0;
   			    D= (int)(S*360/perimetro);   		        
   			    int G = 70;
   	            double PG=(15*Math.PI);
   	            double Gir = G*PG/360;
   	            double PL = 2.5*Math.PI*2;
   	         	int R = 0;
   	   	        R = (int)(Gir*360/PL);
   	   	        int G1 = -100;
   	   	        int PG1=(int)(15*Math.PI);
   	   	        double Gir1 = G1*PG1/360;
   	            double PL1 = 2.5*Math.PI*2;
   	   	        int R1 = 0;
   	   	        R1 = (int)(Gir1*360/PL1);
   	   	        int G2 = 30;
   	   	        int PG2=(int)(15*Math.PI);
   	   	        double Gir2 = G2*PG2/360;
   	            double PL2 = 2.5*Math.PI*2;
   	   	        int R2 = 0;
   	   	        R2 = (int)(Gir2*360/PL2);
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
            	double perimetro = 2.8*Math.PI*2;
   			    double S = 30; 
   			    int D = 0;
   			    D= (int)(S*360/perimetro);
   		        int G = 20;
   	            double PG=(15*Math.PI);
   	            double Gir = G*PG/360;
   	            double PL = 2.5*Math.PI*2;
   	         	int R = 0;
   	   	        R = (int)(Gir*360/PL);
   	   	        int G1 = -90;
   	   	        int PG1=(int)(15*Math.PI);
   	   	        double Gir1 = G1*PG1/360;
   	            double PL1 = 2.5*Math.PI*2;
   	   	        int R1 = 0;
   	   	        R1 = (int)(Gir1*360/PL1);
   	   	        int G2 = 70;
   	   	        int PG2=(int)(15*Math.PI);
   	   	        double Gir2 = G2*PG2/360;
   	            double PL2 = 2.5*Math.PI*2;
   	   	        int R2 = 0;
   	   	        R2 = (int)(Gir2*360/PL2);
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
                        D = (int)(((360*x)-6000)/17);
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