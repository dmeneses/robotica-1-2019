
public class Robot {
	Auto carrito;
	double velocidad;  
	String[]listaSensores;
	String marca;
	boolean encendido;
	String arancar ;
	public Robot (String unamarca,String avanzar,double vel,boolean on,Auto auto,String[]lista)
	{  
		listaSensores=lista;
		arancar = avanzar;
		carrito = auto;
		marca = unamarca;
		encendido = on;
		velocidad= vel;	
	}

	public void arrancarAuto ()
	{
    encendido= true;
		carrito.arancarAuto();
	
	}
	
	public void listaSensores()
	{ 
		
		for (int listaSensores = 1 ; listaSensores <= 3;listaSensores =listaSensores++)
		System.out.println(listaSensores);
	
	
		
	}
	
		
		
		
	}
	
	


