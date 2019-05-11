import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;


public class Avanzar {
	UltraSonicSensor ojos = new UltraSonicSensor(SensorPort.S4);
	EV3LargeRegulatedMotor motorDerecho =
			new EV3LargeRegulatedMotor(MotorPort.C);
	EV3LargeRegulatedMotor motorIzquierdo = 
			new EV3LargeRegulatedMotor(MotorPort.B);
	SensorColor robot= new SensorColor();
	void algo(int[] ruta){

	int[] Ar=ruta;{
		int co=ruta.length;
	for(int i=0;i<=co-1;i=i+1){
		int x=Ar[i];
		if (i%2==0){
			int g=x;
			double cm=((g*5.9*2*Math.PI)/360);
			int formula=(int) ((360*cm)/(2*Math.PI*3.35));
			System.out.println(formula);
			motorDerecho.setSpeed(200);motorIzquierdo.setSpeed(200);
			motorDerecho.rotate(formula*-1, true);
			motorIzquierdo.rotate(formula);
		}
		else {
			int cm=x;
			int formula=(int) ((360*cm)/(2*Math.PI*3.35));
			motorDerecho.setSpeed(300);
			motorIzquierdo.setSpeed(300);
			motorDerecho.rotate(formula,true);
			motorIzquierdo.rotate(formula);
			
			
		   }
		
		}
	
	
	}
	
	}
	void otro(){
	float distancia = ojos.getRange();
	double cm=(distancia*100)-5;
	int formula=(int) ((360*cm)/(2*Math.PI*3.35));
	motorDerecho.setSpeed(400);
	motorIzquierdo.setSpeed(400);
	motorDerecho.rotate(formula,true);
	motorIzquierdo.rotate(formula);
	}
	int color(){
		int c=robot.obtenerColor();
		return c;
	}
	void avanzar(int x){
		double cm=x;
		int formula=(int) ((360*cm)/(2*Math.PI*3.35));
		motorDerecho.setSpeed(500);
		motorIzquierdo.setSpeed(500);
		motorDerecho.rotate(formula,true);
		motorIzquierdo.rotate(formula);
	}
	void girar(int G){
		int g=G;
		double cm=((g*16*2*Math.PI)/360);
		int formula=(int) ((360*cm)/(2*Math.PI*3.35));
		System.out.println(formula);
		motorDerecho.rotate(formula);motorDerecho.setSpeed(300);
	}
	}
	
	
