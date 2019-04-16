import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class Robot {

	EV3ColorSensor color;
	EV3LargeRegulatedMotor motorA;
	EV3LargeRegulatedMotor motorC;
	EV3UltrasonicSensor ojos ; 
	Ruta recorrido ;
	
	public Robot(Ruta r){
	 color = new EV3ColorSensor(SensorPort.S1);
	 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
     motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
     ojos = new EV3UltrasonicSensor (SensorPort.S4);
     recorrido = r;
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
    
    public String reconoceColor()
    {
    	String colorconocido;
    	
    	 SampleProvider sp = color.getColorIDMode();
         String colorreconocido;
   		while(true){
   			float[] sample = new float [sp.sampleSize()];
   			sp.fetchSample(sample, 0);
   			if (sample[0] == 0){
   				colorconocido="rojo";
   				}else{
   					if (sample[0] == 1){
   						colorconocido="verde";
   						}else{
   							if (sample[0] == 2){
   								colorconocido="azul";
   								}else{
   									colorconocido="amarillo";
   									}
   							return colorconocido;
   						}
   					}
   			}
    }
}
    
                                  

