
public class inicio {
	public static void main(String[] args)
	{
		// TODO Auto-generate method stub
		Robot robot1;
		robot1= new Robot(2.5,12);
	  
		   //robot1.avanzarCentimentros
		   //robot1.avanzarCentimentros(45)
		  // robot1.avanzarCentimentros(98)
		   //robot1.avanzarCentimentros(456)
		   //robot1.avanzarCentimentros(100)
		   //robot1.avanzarCentimentros(10)
		   while (true)
		   {
			   //si el pulsador en avanzar distancia detectada
			   if (robot1.detectarPulsador()==1)
			   {
				  int x=robot1.detectarDistancia();
				  robot1.avanzarCentimentros(x);
				  robot1.girarGrados(90);
				  robot1.detectarDistancia();
				  robot1.avanzarCentimentros(x);
				  robot1.girarGrados(90);
				  robot1.detectarDistancia();
				  robot1.avanzarCentimentros(x);
			   }
			
		   }

}
}
