

	import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Stopwatch;
	public class sumitos	
	{	
		public static void main(String args[])	
		{
			robosumito robo1;
			robo1= new robosumito(3, 12.3);

			/*Stopwatch relog;
			relog= new Stopwatch ();
			relog.reset();*/
			boolean cambiar = false;
			robo1.girarOjitos(cambiar);
			int cont = 0;
			while (true)			
			{ 
				//robo1.cuchillito();
				robo1.acelerar(0);
			robo1.atacar();
			robo1.detectarDistancia();
			
				
				int luz = robo1.detectarLuz();
				//System.out.println("luz "+luz);
				
				if( luz > 20 )//detectar borde
				{ 
			
					System.out.println("blanquito");
			
					 robo1.avanzarCentimentros(20);
					 robo1.girarGrados(180);
					 robo1.atacar();
					}
				
			
				int ojos= robo1.detectarDistancia();
				if (ojos<27)
				{ robo1.acelerar(0);
					robo1.megaAtaque(0);
					//robo1.avanzarCentimentros(10);
					//robo1.megaAtaque(0);
					//robo1.girarGrados(180);
					}
				int boton= robo1.detecatarPulsadorIzquierda();
				if (boton==1)
				{
					robo1.avanzarCentimentros(8);
					robo1.girarGrados(95);
				}
				int boton1= robo1.detectarPulsadorDerecha();
				if (boton1==1)
				{
					robo1.avanzarCentimentros(8);
					robo1.girarGrados(-95);
				}
				
				
				//if()//atacar contrincante 
				//{}
			}
		}
	}

		
	