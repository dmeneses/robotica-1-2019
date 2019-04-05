
public class Inicio 
{

	public static void main(String[] args) 
	{
		Robot robbie;
		robbie = new Robot();
		
		
		while(true)
		{
			if (robbie.detectarPulsador() == 1)
			{
				int x = robbie.detectarDistancia()
				robbie.avnazarCentimetros(x);
			}
		}

	}

}
