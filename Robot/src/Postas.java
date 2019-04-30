import lejos.hardware.motor.Motor;


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
		robot = new Robot(2.75,13.6); //11.35
		
		rojo = new int[3];
		amarillo = new int[3];
		verde = new int[3];
		azul = new int[3];
		
		
		rojo[0]=20;
		rojo[1]=-90;
		rojo[2]=70;
		
		amarillo[0]=70;
		amarillo[1]=-100;
		amarillo[2]=30;
		
		verde[0]=-50;
		verde[1]=120;
		verde[2]=-70;
		 
		azul[0]=0;
		azul[1]=0;
		azul[2]=0;
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
		else if (color == 3)
		{
			post1 = amarillo[0];
			post2 = amarillo[1];
			post3 = amarillo[2];
		}
		else if (color == 1)
		{
			post1 = verde[0];
			post2 = verde[1];
			post3 = verde[2];
		}
		else if (color == 2)
		{
			post1 = azul[0];
			post2 = azul[1];
			post3 = azul[2];
		}
		robot.dibujarTriangulo(distanciatramo, post1, post2, post3);
		//int velocidad1= Motor.B.getSpeed();
		//int ace1 = Motor.B.getAcceleration();
		
		Motor.B.setSpeed(800);
		Motor.C.setSpeed(800);
		Motor.B.setAcceleration(500);
		Motor.C.setAcceleration(500);
		
		int x= robot.detectardistancia();
		robot.avanzarcm(x-8);
		//Motor.B.setSpeed(velocidad1);
		//Motor.C.setSpeed(velocidad1);
		//Motor.B.setAcceleration(ace1);
		//Motor.C.setAcceleration(ace1);
		
		
	}
}
