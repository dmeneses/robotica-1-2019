


public class Postasprincipal {

	public static void main(String[] args) {
		int[] rojo = {90,90,90};
		int[] amarillo = {90, 90,90 };
		int[] verde = {90, 90, 90 };
		int[] azul = {90, 90, 90 };
	Ruta ruta = new Ruta(rojo,amarillo,verde,azul,57);
		
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
      
	

