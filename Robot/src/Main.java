
public class Main 
{

	public static void main(String[] args)
	{
		
		Robot robot1;
		robot1 = new Robot();
			robot1.avanzarcm(55);
			robot1.avanzarcm(55);
			robot1.avanzarcm(55);
			robot1.avanzarcm(55);
		//repetir detectar pulsador en 1
			while (true)
			{//si pulsador det avanzar dist detectada
				if (robot1.detectarpulsador()==1)
				{
					int x= robot1.detectardistancia();
					robot1.avanzarcm(x);
				}
			}

	}

}
