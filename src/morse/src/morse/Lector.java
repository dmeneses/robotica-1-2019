package morse;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Stopwatch;

public class Lector {

	TouchSensor sensor1 = new TouchSensor(SensorPort.S1);
	TouchSensor sensor2 = new TouchSensor(SensorPort.S2);

 Auto auto;
    
	public Lector(Auto auto){
		this.auto = auto;
	}
    
    public void marcarPunto(){
    	Stopwatch s=new Stopwatch();
    	
    	boolean funcionar=true;
    	 
		while(funcionar==true){
			boolean estaPresionado = sensor1.isTouched();
			boolean estaPresionado2 = sensor2.isTouched();
			
    	if(estaPresionado==true){
    		int tiempo=s.elapsed();
    		char punto='.';
    		System.out.println(punto);
    		System.out.println(tiempo);
    		
    	}
    	if(estaPresionado2==true){
    		
    		s.reset();
    		}
    	
		}
    }
}
