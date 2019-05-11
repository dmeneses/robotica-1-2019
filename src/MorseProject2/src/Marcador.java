import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class Marcador {
	EV3MediumRegulatedMotor motor;
  
  
	  
	              
	              public Marcador(){
	            	  motor = new EV3MediumRegulatedMotor(MotorPort.B);
	              }
	              public void subirMarcador(){
	            	  int angulo=50;
        			  motor.rotate(angulo);
	              }
	              public void bajarMarcador(){
	            	  //double o=2*3.14*180/30/360;
	            	  int angulo = -50;
	            			  motor.rotate(angulo);
	              }
  
  
  
}
