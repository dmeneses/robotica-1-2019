import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class Motor {
	EV3LargeRegulatedMotor motorDerecho =
			new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorIzquierdo = 
			new EV3LargeRegulatedMotor(MotorPort.B);
	void AvanzarCm (int Cm){
		int cm=Cm;
		int formula=(int) ((360*cm)/(2*Math.PI*3.35));
		motorDerecho.setSpeed(500);
		motorIzquierdo.setSpeed(500);
		motorDerecho.rotate(formula,true);
		motorIzquierdo.rotate(formula);
		
		System.out.println("MOVERSE");
		System.out.println(formula);
		
	}
	void Girar(int grados){
		int g=grados;
		double cm=((g*16*2*Math.PI)/360);
		int formula=(int) ((360*cm)/(2*Math.PI*3.35));
		System.out.println(formula);
		
		motorDerecho.rotate(formula);motorDerecho.setSpeed(300);
		
	}
	
 
}
