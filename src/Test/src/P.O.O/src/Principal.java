
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto carrito = new Auto("rojo", "toyota", 10, true);
		Auto turbito = new Auto("azul", "bmw", 120, true);
		
		carrito.arancarAuto();
		turbito.arancarAuto();
		carrito.obtenercolor();
		String colorDelAuto=carrito.obtenercolor();
		System.out.println("el color es :"+colorDelAuto);
		double vel=carrito.acelerar(60);
	    System.out.println("la nueva velocidad es :"+ vel);
	    String[]lista={"ultrasonico","touch","color"};
	    Robot aXL = new Robot("lego","avanzando",12.5,true,turbito, lista);
	    aXL.arrancarAuto();
	     
	}

}