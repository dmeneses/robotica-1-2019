import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;
public class moverse {

	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
    EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
    Button.waitForAnyPress();
    //motorD.setSpeed(240);
	//motorD.forward();
    //motorI.setSpeed(240);
    //motorI.forward();
    //Delay.msDelay(2360);
    //motorI.rotate(635, true);
    //motorD.rotate(635);
    //motorI.stop();
    //motorD.stop();
    //motorI.rotate(180);
    //motorD.rotate(180);
    //motorI.stop();
    //motorD.stop();
    int D = 0;
    int x = 30;
	D = 360*x/17; 
    motorI.rotate(D, true);
    motorD.rotate(D);
    motorI.rotate(360);
	motorD.rotate(360);
	motorI.rotate(360,true);
	motorD.rotate(360);
	}

}