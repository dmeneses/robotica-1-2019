


public class Postasprincipal {

	public static void main(String[] args) {
		int[] rojo = {-60,180,-60};
		int[] amarillo = {360,-180,180 };
		int[] verde = {360,360,360 };
		int[] azul = {-180,360,180};
	Ruta ruta = new Ruta(rojo,amarillo,verde,azul,64);
		
      Robot bender = new Robot(ruta);
      String color = bender.reconoceColor();
      System.out.println(color);
    
      if (color =="rojo")
    {
    	bender.seguirRuta(ruta.devolverlistaRojo(),ruta.devolverdistancia() );
    }
    if (color =="amarillo")
    {
    	bender.seguirRuta(ruta.devolverlistaAmarillo(),ruta.devolverdistancia() );
    }
    if (color =="verde")
    {
    	bender.seguirRuta(ruta.devolverlistaVerde(),ruta.devolverdistancia() );
    }
    if (color =="azul")
    {
    	bender.seguirRuta(ruta.devolverlistaAzul(),ruta.devolverdistancia() );
    }
    
    bender.avanzarconojos();
    
  	//bender.seguirRuta(ruta.devolverlistaRojo(),ruta.devolverdistancia() );
  	//bender.seguirRuta(ruta.devolverlistaVerde(),ruta.devolverdistancia() );
  	//bender.seguirRuta(ruta.devolverlistaAmarillo(),ruta.devolverdistancia() );
  	//bender.seguirRuta(ruta.devolverlistaAzul(),ruta.devolverdistancia() );

 
   
		}
	}

      
    //bender.avanzar(30);
	//bender.girarRobot(800);
	//bender.avanzar(30);
	//bender.girarRobot(90);
	//String[]lista={"ultrasonico","touch","color"};
	
	//bender.seguirRuta(ruta.devolverlistaRojo(),ruta.devolverdistancia() );
      
	

