

public class inicio {

	public static void main(String[] args)
	{
		Robot ultron3 = new Robot();
		while(true){
		String colora = ultron3.avisarColor();
			if(colora == "Rojo")
			{
				ultron3.avanzarRojo();
			}
			
			if(colora == "Azul")
			{
				ultron3.avanzarAzul();
			}
			
			if(colora == "Amarillo")
			{
				ultron3.avanzarAmarillo();
			}
			
			if(colora == "Verde")
			{
				ultron3.avanzarVerde();
			}
		
	
	}
	}
}
