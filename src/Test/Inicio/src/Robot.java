import lejos.utility.Delay;


public class Robot 
{	
	Acciones acb = new Acciones();
	
	String colorA;
	public String avisarColor()
	 {
		boolean colorNoConocido = true;
		String colorA = "";
		
		while(colorNoConocido)
		{
		    //int numero = acb.detectarColor();
		
			//System.out.println(numero);
			
			 
		    if(acb.detectarColor() == 0)
			 {
				 colorA = "Rojo";
				 colorNoConocido = false;
			 }	
		    
		    if(acb.detectarColor() == 1)
			 {
				 colorA = "Verde";
				 colorNoConocido = false;
			 }	
		    if(acb.detectarColor() == 2)
			 {
				 colorA = "Azul";
				 colorNoConocido = false;
			 }	
		    if(acb.detectarColor() == 3)
			 {
				 colorA = "Amarillo";
				 colorNoConocido = false;
			 }	
			
		    System.out.println(colorA);
			
		}
		
		 return colorA;
	 }
	
	public void avanzarRojo()
	{	
			acb.girar(20);
			acb.avanzar(30);
			acb.girar(-90);
			acb.avanzar(30);
			acb.girar(70);
			Delay.msDelay(0);
			boolean dis = true;
			while (dis)
			{
				System.out.println("Distancia" + acb.detectarDistancia());
				
				if(acb.detectarDistancia() > 0)
				{
					int pollo = (int)acb.detectarDistancia();
					acb.avanzar(pollo);
					dis = false;
				}
			}			
		
	}
	
	
	public void avanzarAzul()
	{			
			acb.girar(70);
			acb.avanzar(30);
			acb.girar(-100);
			acb.avanzar(30);
			acb.girar(30);
			Delay.msDelay(0);
			boolean dis = true;
			while (dis)
			{
				System.out.println("Distancia" + acb.detectarDistancia());
				
				if(acb.detectarDistancia() > 0)
				{
					int pollo = (int)acb.detectarDistancia();
					acb.avanzar(pollo);
					dis = false;
				}
			}			
		
	}
	
	public void avanzarAmarillo()
	{		
			acb.girar(-20);
			acb.avanzar(30);
			acb.girar(40);
			acb.avanzar(30);
			acb.girar(-20);
			Delay.msDelay(0);
			boolean dis = true;
			while (dis)
			{
				System.out.println("Distancia" + acb.detectarDistancia());
				
				if(acb.detectarDistancia() > 0)
				{
					int pollo = (int)acb.detectarDistancia();
					acb.avanzar(pollo);
					dis = false;
				}
			}
				
	}
	
	public void avanzarVerde()
	{		
			acb.girar(-50);
			acb.avanzar(30);
			acb.girar(120);
			acb.avanzar(30);
			acb.girar(-70);
			Delay.msDelay(0);
			boolean dis = true;
			while (dis)
			{
				System.out.println("Distancia" + acb.detectarDistancia());
				
				if(acb.detectarDistancia() > 0)
				{
					int pollo = (int)acb.detectarDistancia();
					acb.kungFuPanda(pollo);
					dis = false;
				}
			}			
		
	}
	 

}
