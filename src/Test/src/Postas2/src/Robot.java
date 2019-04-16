import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class Robot {

	String nombre;
	
	 double distancia;
	 int grados;
	 
	 EV3LargeRegulatedMotor motorB;
	 EV3LargeRegulatedMotor motorC;
	 EV3ColorSensor colores;
	 EV3UltrasonicSensor ojos;
	 public  Robot (String unnombre,int unadistancia){
		 
		 EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
			EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		 nombre= unnombre;
		
		 distancia= unadistancia;
	 }
		 
	public void avanzar()
	{
		distancia = distancia-4;
		grados=(int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
		motorB.setSpeed(500);
		motorB.forward();
		motorC.setSpeed(500);
		motorC.forward();
		
		
		
		
	}
		 
	 }

	


