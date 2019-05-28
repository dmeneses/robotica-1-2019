package robozumo;

import lejos.hardware.Button;
import lejos.utility.Delay;

public class Principal 
{
	
	public static void main(String[] args) 
	{
		Zumo kamizake = new Zumo();
	    int seg = 3;	
		Button.waitForAnyPress();
		Delay.msDelay(seg*1000);
		
		
		while(true)
		{
			
			kamizake.Atacar();
			// kamizake.contrAtaque();
			//kamizake
			
		}
		
		//ya no se sale del campo de batalla_pero falta que dectete al rival y lo siga
		//nada mas
		
		
				

	}

}
