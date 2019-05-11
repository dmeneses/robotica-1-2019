package morse;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Marcador {
EV3MediumRegulatedMotor motor;

public Marcador(){
   motor= new EV3MediumRegulatedMotor(MotorPort.A);	
   
}

public void bajarMarcador(int grados){
	int g=grados;
	double cm=((g*5.9*2*Math.PI)/360);
	int formula=(int) ((360*cm)/(2*Math.PI*7));
	motor.setSpeed(300);
	motor.rotate(formula);
	}
public void subirMarcador(int grados){
	int g=grados;
	double cm=((g*5.9*2*Math.PI)/360);
	int formula=(int) ((360*cm)/(2*Math.PI*7));
	motor.setSpeed(300);
	motor.rotate(formula);
}

}
