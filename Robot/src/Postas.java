
public class Postas 
{
	Robot robot;
	int distanciatramo;
	int[] rojo; //0
	int[] amarillo;  //3
	int[] verde;  //1
	int[] azul;  //2
	
	//constructor
	public Postas()
	{
		distanciatramo = 30;
		robot = new Robot(2.75,12); //11.35
		rojo = new int[3];
		amarillo = new int[3];
		verde = new int[3];
		azul = new int[3];
		
		
		rojo[0]=300;
		rojo[1]=300;
		rojo[2]=300;
		
		amarillo[0]=300;
		amarillo[1]=300;
		amarillo[2]=300;
		
		verde[0]=300;
		verde[1]=300;
		verde[2]=300;
		
		azul[0]=300;
		azul[1]=300;
		azul[2]=300;
	}
	
	//metodos
	
	public void iniciar()
	{
		robot.detectarColor();
		int color = robot.detectarColor();
		
		int post1 = 0;
		int post2 = 0;
		int post3 = 0;
		
		if (color == 0)
		{
			post1 = rojo[0];
			post2 = rojo[1];
			post3 = rojo[2];
		}
		if (color == 3)
		{
			post1 = amarillo[0];
			post2 = amarillo[1];
			post3 = amarillo[2];
		}
		if (color == 1)
		{
			post1 = verde[0];
			post2 = verde[1];
			post3 = verde[2];
		}
		if (color == 2)
		{
			post1 = azul[0];
			post2 = azul[1];
			post3 = azul[2];
		}
		robot.dibujarTriangulo(distanciatramo, post1, post2, post3);
		int x= robot.detectardistancia();
		robot.avanzarcm(x);
		
		
	}
}