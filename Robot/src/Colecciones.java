

public class Colecciones 
{
	Robot40 robot1;
	int[] azul;
	int[] rojo;
	int[] verde;
	int[] amarillo;
	
	public Colecciones()
	{	robot1=new Robot40(2.55, 12.3);
		azul =new int[3];
		azul[0]=20;
		azul[1]=-50;
		azul[2]=80;
		int Aazul=azul[0];
		int Bzul=azul[1];
		int Cazul=azul[2];

rojo=new int[3];
rojo[0]=50;
rojo[1]=60;
rojo[2]=40;
int Arojo=rojo[0];
int Brojo=rojo[1];
int Crojo=rojo[2];

verde=new int[3];
verde[0]=80;
verde[1]=90;
verde[2]=100;
int Averde=verde[0];
int Bverde=verde[1];
int Cverde =verde[2];

amarillo=new int[3];
amarillo[0]=120;
amarillo[1]=150;
amarillo[2]=200;
int Aamarillo=amarillo[0];
int Bamarillo=amarillo[1];
int Camarillo=amarillo[2];
}
	
	public void empezar()
	{int nc=robot1.detectarcolor();
	int x=robot1.detectardistancia();
		while(true)
		{
			
			if(nc==2){robot1.girarGrados(azul[0]);
			robot1.avanzarCentimetros(20);
			robot1.girarGrados(azul[1]);
			robot1.avanzarCentimetros(20);
			robot1.girarGrados(azul[2]);
			robot1.avanzarCentimetros(x);	
			}
			if(nc==0){robot1.girarGrados(rojo[0]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(rojo[1]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(rojo[2]);
				robot1.avanzarCentimetros(x);			
			}
			if(nc==1){robot1.girarGrados(verde[0]);
					robot1.avanzarCentimetros(20);
					robot1.girarGrados(verde[1]);
					robot1.avanzarCentimetros(20);
					robot1.girarGrados(verde[2]);
					robot1.avanzarCentimetros(x);
			}
	
		}
	}
}
