


public class Postasprincipal {

	public static void main(String[] args) {
		int[] rojo = {360, 360, 360 };
		int[] amarillo = {90, -90, 90 };
		int[] verde = {90, -90, 90 };
		int[] azul = {90, -90, 90 };
		Ruta ruta = new Ruta(rojo,amarillo,verde,azul,17);
		
      Robot bender = new Robot(ruta);
  	bender.seguirRuta(ruta.devolverlistaRojo(),ruta.devolverdistancia() );
  	

 
   
		}
	}

      
    //bender.avanzar(30);
	//bender.girarRobot(90);
	//bender.avanzar(30);
	//bender.girarRobot(90);
	//String[]lista={"ultrasonico","touch","color"};
	
	//bender.seguirRuta(ruta.devolverlistaRojo(),ruta.devolverdistancia() );
      
	

