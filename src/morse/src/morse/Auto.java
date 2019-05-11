package morse;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Auto {
   Marcador marcador;
   EV3MediumRegulatedMotor motor;
   
           EV3LargeRegulatedMotor motorDerecho =
		   new EV3LargeRegulatedMotor(MotorPort.C);
		   EV3LargeRegulatedMotor motorIzquierdo = 
		   new EV3LargeRegulatedMotor(MotorPort.B);
   
  public Auto(){
	  marcador= new Marcador();
  }
  public void avanzarCm(int centimetros){
	  int lon=centimetros;
		int formula2=(int) ((360*lon)/(2*Math.PI*3.35));
		motorDerecho.setSpeed(100);
		motorIzquierdo.setSpeed(100);
		motorDerecho.rotate(formula2,true);
		motorIzquierdo.rotate(formula2);
  }
  public void dibujarPunto2(int grados){
	  int g=grados;
	  marcador.bajarMarcador(g*-1);
	  marcador.subirMarcador(g);
	  
  }
  public void dibujarLinea2(int grados){
	  int g=grados;
	  marcador.bajarMarcador(g*-1);
	  avanzarCm(6);
	  marcador.subirMarcador(g);
  }
}
