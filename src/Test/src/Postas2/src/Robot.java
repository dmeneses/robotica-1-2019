import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class Robot {

	String nombre;
	
	 double distancia;
	 int grados;
	 
	 EV3LargeRegulatedMotor motorB;
	 EV3LargeRegulatedMotor motorC;
	 EV3ColorSensor colores;
	 EV3UltrasonicSensor ojos;
	 
	 GirodeEje ge;
	 public  Robot (String unnombre,int unadistancia){
		 
	  motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	  motorC = new EV3LargeRegulatedMotor(MotorPort.C);
	 colores = new EV3ColorSensor(SensorPort.S2);	 
	  
	  nombre= unnombre;
		 
		
		 distancia= unadistancia;
		 ge = new GirodeEje(10);
	 }
		 
	public void avanzar()
	{
		motorB.setSpeed(500);
		motorC.setSpeed(500);
		
		distancia = distancia-4;
		grados=(int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
				
	}
	
	public void girar(int numero)
	{
		 int grados = ge.girar(numero);
		 
		 motorB.rotate(-grados,true);
			motorC.rotate(grados);		
		
	}
	public String reconocerColor()
	{
		SampleProvider sp = colores.getColorIDMode();
		String colorActivado = "";
		while(colorActivado == ""){
		float[]sample = new float [sp.sampleSize()];
		sp.fetchSample(sample,0);
		if (sample [0]==0){
			colorActivado = "rojo";
		}
		else
		{
		if (sample [0]==1){
			colorActivado = "verde";
					}
			else
			{
				if (sample [0]==2){
					colorActivado = "azul";
				}
			else
				{
				if (sample [0]==3){
					colorActivado = "amarillo";
				}
				else
				{
					colorActivado = "";
				}
				}
				
			}
		}
		
		}
		return colorActivado;
		
	}
	
	
		 
	 }

	



