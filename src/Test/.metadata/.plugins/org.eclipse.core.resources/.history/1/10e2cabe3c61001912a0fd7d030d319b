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
		    int numero = acb.detectarColor();
		
			System.out.println(numero);
			
			 
		    if(acb.detectarColor() == 0)
			 {
				 colorA = "Rojo";
				 colorNoConocido = false;
			 }	
			
		}
		
		 return colorA;
	 }
	
	public void avanzarRojo()
	{
		
		//int color = "rojo"; //acb.detectarColor();
		
		//if(color == 0)
		//{
			
			acb.girar(30);
			acb.avanzar(30);
			acb.girar(-60);
			acb.avanzar(30);
			acb.girar(30);
			int pollo = acb.detectarDistancia();
			System.out.println("distancia" + pollo);
			Delay.msDelay(3000);
			acb.avanzar(pollo);
			
			
			
			
		//}
	}
	 

}
