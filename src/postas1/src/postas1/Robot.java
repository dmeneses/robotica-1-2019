package postas1;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;



public class Robot {
	
	int avanzar;
	double distancia;
	EV3TouchSensor morce ;
	EV3TouchSensor terminarmorce;
	EV3LargeRegulatedMotor motorA ;
    EV3LargeRegulatedMotor motorC ;
    
    
    public Robot (double unadistancia)
    
    {
    	 motorA = new  EV3LargeRegulatedMotor(MotorPort.A);
 	      motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
 	      morce = new EV3TouchSensor(SensorPort.S1);
    	  terminarmorce= new EV3TouchSensor(SensorPort.S2);
 	      distancia = distancia;
 	      
    	avanzar =(int)(distancia*360/17);
    	
    	motorA.rotate(avanzar,true);
    	motorC.rotate(avanzar);
    	
    }
public void ingresarmorce()
{
// usar un if con los segundos utilizados en el sensor	y con el segundo sensor terminarlo



}
public void traducirmorce()
{
	//usar un while para que traduzca el codigo






}   
public void escribirAlPiso()
{
	
	//llamar ala clase programa base

}
    
    
    
}
