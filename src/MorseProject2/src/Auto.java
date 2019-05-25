import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Auto {
	EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
	Marcador marcador;
	public Auto(){
		marcador=new Marcador();
	}
	public void AvanzarCm(double cm){
		double distancia;
		distancia = ((360*cm))/(2*Math.PI*(2.8));
		motorDerecho.setSpeed(100);
		motorIzquierdo.setSpeed(100);
		motorDerecho.rotate((int) distancia, true);
		motorIzquierdo.rotate((int) distancia);
	}
	public void dibujarPunto(){
		marcador.bajarMarcador();
		AvanzarCm(0.1);
		marcador.subirMarcador();
	}

	public void dibujarLinea(){
		marcador.bajarMarcador();
		AvanzarCm(4);
		marcador.subirMarcador();
		
	}
}
