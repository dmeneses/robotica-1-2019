import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
public class Robot {
	EV3ColorSensor  sensor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
	public Robot ()
	{
		sensor = new  EV3ColorSensor(SensorPort.S4);
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		motorI = new EV3LargeRegulatedMotor(MotorPort.B);
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
	        	}
	        	else if(sample[0]==1)
	        	{
	        		 Color = "Verde";
	        		 rutaV(Color);
	        	}
	        	else if(sample[0]==2)
	        	{
	        		 Color = "Azul";
	        		 rutaA(Color);
	        	}
	        	else if(sample[0]==3)
	        	{
	        		 Color = "Amarillo";
	        		 rutaY(Color);
	        	}
	        	else
	        	{
	            System.out.println(Color = null);
	            Delay.msDelay(900);
	        	}
	        	System.out.println(Color);
                } 
                }
	public void rutaR(String Color)
	{
		        if(Color == "Rojo"){
        	    motorI.setSpeed(motorI.getMaxSpeed());
        	    motorD.setSpeed(motorD.getMaxSpeed());
        	    motorI.rotate(360, true);
                motorD.rotate(360);
                Delay.msDelay(900);
    	       }	      
	           }
	public void rutaV(String Color)
	           {
		       if(Color == "Verde"){
    	       motorI.setSpeed(motorI.getMaxSpeed());
    	       motorD.setSpeed(motorD.getMaxSpeed());
    	       motorI.rotate(360, true);
               motorD.rotate(360);
               Delay.msDelay(900);
	           }
} 
    public void rutaA(String Color) 
               {
    	       if(Color == "Azul"){
 	           motorI.setSpeed(motorI.getMaxSpeed());
 	           motorD.setSpeed(motorD.getMaxSpeed());
 	           motorI.rotate(360, true);
               motorD.rotate(-460);
               Delay.msDelay(900);    	
               }
               }
               public void rutaY(String Color) 
               {
               if(Color == "Amarillo"){
               motorI.setSpeed(motorI.getMaxSpeed());
               motorD.setSpeed(motorD.getMaxSpeed());
               motorI.rotate(360, true);
               motorD.rotate(360);
               Delay.msDelay(900);    	
    }
    }
}
























