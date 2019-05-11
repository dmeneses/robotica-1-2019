package ejemplosensortouch;



import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class EjemplosSensorTouch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
		 
		  boolean estaPresionado = sensor1.isTouched();
		  
		  System.out.println(estaPresionado);
		 EV3LargeRegulatedMotor motorDerecho = 
        		 new EV3LargeRegulatedMotor(MotorPort.A);
         EV3LargeRegulatedMotor motorIzquierdo =
        		 new EV3LargeRegulatedMotor(MotorPort.D);
         
         while(true){
        	 
	        
	        motorDerecho.setSpeed(500);
	     	motorIzquierdo.setSpeed(500);
	     	motorIzquierdo.forward();
	     	motorDerecho.forward();
	     	estaPresionado =  sensor1.isTouched();
	     	System.out.println("estoy corriendo rum rum :v ");
	     	if(estaPresionado == true)
	     	{
	     		motorDerecho.backward();
	     		motorIzquierdo.backward();
	     		System.out.println("cuidado wey estoy retrocediendo :D ");
	     		Delay.msDelay(2000);
	     		if(estaPresionado == false )
	     		motorDerecho.setSpeed(600);
	     		motorIzquierdo.setSpeed(100);
                motorDerecho.forward();
                motorIzquierdo.stop();
                System.out.println("estoy girando wey :D");
                Delay.msDelay(5000);
	     	}
	     	
         }     
  }
  
	}


