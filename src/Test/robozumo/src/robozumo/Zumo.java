package robozumo;

public class Zumo {

		
	Acciones Wilson = new Acciones();
	 
	
	
	public void contrAtaque()
	 {
		  while(true)
		  {
			/*Wilson.RETRO ();
			Wilson.girar(500);
			Wilson.avanzar();
			*/
				
		  }
			
		 
	 
		
	 }
		public void Atacar()
		{
			
			
	    while(true)
          {
   			if (Wilson.detectarColor() <= 0.1)
			{	
			  Wilson.avanzar();
			  Wilson.avanzito();
			}
			else 
			{
				Wilson.parar();
				Wilson.RETRO();
				Wilson.girar(500);
			}	
          }	
		}
		
	

}
