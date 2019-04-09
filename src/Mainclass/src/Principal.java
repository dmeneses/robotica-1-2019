
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Auto carrito = new Auto("verde" ,"tacoma",4,120, false);
				Auto autito = new Auto("naranja" ,"toyota",4,50,true );
				String[]lista={"ultrasonico","touch","color"};
				Robot bender= new Robot("rosado", 2, 4 , 250, true ,autito,lista);
		   bender.arrancarMotor();
		   bender.listarSensores();
		   carrito.arrancarMotor();
		   autito.arrancarMotor();
		   autito.getColor();
		   String colorDelAuto=carrito.getColor();
		   System.out.println("elcolor del auto es ;"+ colorDelAuto);
		    double i = carrito.acelerar(55);
		    System.out.println("la nueva velociadad es:" +i);
		    

	}

}
