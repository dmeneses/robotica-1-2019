import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;



public class RuedasGrados {
	EV3LargeRegulatedMotor motorDerecho = 
      		 new EV3LargeRegulatedMotor(MotorPort.A);
	EV3LargeRegulatedMotor motorIzquierdo = 
      		 new EV3LargeRegulatedMotor(MotorPort.D);
	UltraSonicSensor ojo = new UltraSonicSensor(SensorPort.S4);
	sensor_color_ objeto = new sensor_color_();

	void avanzarCm(int cm) {
	
		double perimetro = 2 * Math.PI * 2.8;
		/*motorDerecho.setSpeed(500);
	    motorIzquierdo.setSpeed(500);*/
		motorDerecho.rotate((int) (360 * cm / perimetro), true);
		motorIzquierdo.rotate((int) (360 * cm / perimetro));

	}

		
		
	

	void girarIzq(int grados) 
	{
		
		double perimetro2 = 2 * Math.PI * 14.6;
		double perimetro = 2 * Math.PI * 2.8;
	    double x =  perimetro2 * grados / 360;
	 	motorIzquierdo.rotate((int) (360 * x / perimetro));
		
	
	}
	void GiraDerecho(int grados){
		double perimetro2 = 2 * Math.PI * 14.6;
		double perimetro = 2 * Math.PI * 2.8;
	    double x =  perimetro2 * grados / 360;
	 	motorDerecho.rotate((int) (360 * x / perimetro));
		
		}
	float ultrasonico(){
		  float distancia = ojo.getRange()*100;
			System.out.println(distancia);
			avanzarCm((int)distancia);
		 
		  return distancia;
	 }
	void GirarEje(int grados){
		double perimetro2 = 2 * Math.PI * 6;
		double perimetro = 2 * Math.PI * 2.8;
	    double x =  perimetro2 * grados / 360;
	   motorDerecho.setSpeed(300);
	    motorIzquierdo.setSpeed(300);
	 	motorDerecho.rotate((int) (360 * x / perimetro),true);
	 	motorIzquierdo.rotate((int) (-360 * x/ perimetro));
	}
	 	
		
	
	int valor(){
		
		int color = objeto.obtenerColor(); 
		return color;
		
	}
	
}
