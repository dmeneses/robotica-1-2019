import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;


public class Main {

	public static void main(String[] args) {
		LCD.drawString("MY NAME IS FURY", 0, 4);
		Delay.msDelay(5000);

	}

}
