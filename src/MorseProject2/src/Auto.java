import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class Auto {
	EV3LargeRegulatedMotor motorDerecho = 
    		 new EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motorIzquierdo = 
    		 new EV3LargeRegulatedMotor(MotorPort.D);
	Marcador  marcador;
public Auto(){
	motorDerecho.setSpeed(100);
	motorIzquierdo.setSpeed(100);
	marcador = new Marcador();
	
}	
  public void avanzarCm (int centimetros){
	  double perimetro = 2 * Math.PI * 2.8;
	  motorDerecho.rotate((int) (360 * centimetros / perimetro), true);
		motorIzquierdo.rotate((int) (360 * centimetros  / perimetro));
         
         
  }
  public void dibujarPunto(){
	  marcador.bajarMarcador();
	  avanzarCm(2);// un punto sera 2 centrimetros .
	  marcador.subirMarcador();
	  avanzarCm(2);
	  
  }
  public void dibujarLinea(){
	  marcador.bajarMarcador();
	  avanzarCm(5); //una linia sera 6 centimetros -
	  marcador.subirMarcador();
	  avanzarCm(2);
	  
  }
}
