package robozumo;

public class Zumo {

		
	Acciones Wilson = new Acciones();
	
		public void Atacar()
		{
			
			
	    while(true)
          {
   			if (Wilson.detectarColor() <= 0.2)
			{	
			  Wilson.avanzar();
			}
			else 
			{
				Wilson.parar();
				Wilson.retroceder();
				Wilson.girar(180);
			}	
          }	
		}
		 
		public void contrAtaque()
		 {
			while(true)
			{
			if (Wilson.detectarDistancia() <= 10)
			 {
				Wilson.girar(180);
				Wilson.avanzar();
			 }
		 
			}
		 }
	

}
