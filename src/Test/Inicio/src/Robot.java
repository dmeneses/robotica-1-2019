
public class Robot 
{	
	Acciones acb = new Acciones();
	
	String colorA;
	public void avanzarRojo()
	{
		
		int color = acb.detectarColor();
		
		if(color == 1)
		{
			
			acb.girar(34);
			acb.avanzar(30);
			acb.girar(-50);
			acb.avanzar(30);
			acb.girar(40);
			acb.avanzar(acb.detectarDistancia());
			
			
		}
	}
	 public String avisarColor()
	 {
		 String colorA = null;
		 if(acb.detectarColor() == 1)
		 {
			 colorA = "Rojo";
		 }
		 return colorA;
	 }

}
