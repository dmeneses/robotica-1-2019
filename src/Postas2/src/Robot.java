import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Robot {

	EV3ColorSensor color;
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorC;
	EV3UltrasonicSensor ojos ; 
	
	public Robot(){
	 color = new EV3ColorSensor(SensorPort.S1);
	 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
     motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
     ojos = new EV3UltrasonicSensor (SensorPort.S4);
	}
    public void avanzar (double distancia){
     
    	int grados = (int)distancia*360/17;
		motorA.rotate(grados,true);
		motorC.rotate(grados);
	}
    
    public void girarRobot(int grados)
    {
    	grados = grados*(800/360);
    	motorA.rotate(grados , true);
		motorC.rotate(-grados);
    }
    
    public void seguirRuta(int[]grados,float distancia){
    	
    	girarRobot(grados[0]);
    	avanzar(distancia);
    	girarRobot(grados[1]);
    	avanzar(distancia);
    	girarRobot(grados[2]);
    	avanzar(distancia);
    	
    	
    }
                                  
}
