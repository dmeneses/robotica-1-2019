

	import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
	public class sumitos	
	{	
		public static void main(String args[])	
		{
			robosumito robo1;
			robo1= new robosumito(3, 12.3);
			
			while (true)			
			{ 
				
				robo1.acelerar(0);
			robo1.atacar();
			
				
				int luz = robo1.detectarLuz();
				//System.out.println("luz "+luz);
				
				if( luz > 20 )//detectar borde
				{ 
					System.out.println("blanquito");
			
					 robo1.avanzarCentimentros(20);
					 robo1.girarGrados(180);
					 robo1.atacar();
					}
				//robo1.girarOjitos(false);
				int ojos= robo1.detectarDistancia();
				if(ojos<15 )//buscar contrincante y atacar
				{
					
					robo1.megaAtaque(0);
					
				}
				
				//if()//atacar contrincante 
				//{}
			}
		}
	}

		
	