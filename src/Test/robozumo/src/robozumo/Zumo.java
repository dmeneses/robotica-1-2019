package robozumo;

public class Zumo {

		
	Acciones Wilson = new Acciones();
	 
	
	
	public void contrAtaque()
	 {
		while(true)
		{
		if (Wilson.detectarDistancia() <= 10)
		 {
			Wilson.RETRO ();
			Wilson.girar(300);
			Wilson.avanzar();
			Wilson.avanzito();
			
		 }
	 
		}
	 }
		public void Atacar()
		{
			
			
	    while(true)
          {
   			if (Wilson.detectarColor() <= 0.1)
			{	
			  Wilson.avanzar();
			}
			else 
			{
				Wilson.parar();
				Wilson.RETRO();
				Wilson.girar(300);
			}	
          }	
		}
		
	

}