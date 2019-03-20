import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class Main {

	public static void main(String[] args) {
		//LCD.drawString("Plugin Test", 0, 4);
		//Delay.msDelay(5000);

	


	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
	
	/*motorB.setSpeed(200);
	motorB.forward();
	
	motorC.setSpeed(200);
	motorC.forward();
	
	Delay.msDelay(3000);
	
	motorB.stop();
	motorC.stop();
	motorB.setSpeed(500);
	motorC.setSpeed(500);*/
	
	int giro = 320;
	double distancia = 50;
	int grados=(int)distancia*360/17;
	motorB.rotate(grados,true);
	motorC.rotate(grados);
	
	motorC.stop();
	motorB.stop();
	

	motorC.rotate(400);
	Delay.msDelay(500);
	
	
	distancia = 50;
	grados=(int)distancia*360/17;
	motorB.rotate(grados,true);
	motorC.rotate(grados);
	
	motorC.stop();
	motorB.stop();
	
	motorC.rotate(380);
	Delay.msDelay(500);
	


	distancia = 50;
	grados=(int)distancia*360/17;
	motorB.rotate(grados,true);
	motorC.rotate(grados);
	
	motorC.stop();
	motorB.stop();
	

	motorC.rotate(380);
	Delay.msDelay(500);
	
	
	distancia = 70;
	grados =(int)distancia*360/17;
	motorB.rotate(grados,true);
	motorC.rotate(grados);
	
	motorC.stop();
	motorB.stop();
	
	
	}
}
	
	
	

	
	/*motorB. setSpeed (200);
	motorB.rotate()
	motorC.rotate*/
	
	
	
	
	
	
	
	



//Button.waitForAnyPress();//
