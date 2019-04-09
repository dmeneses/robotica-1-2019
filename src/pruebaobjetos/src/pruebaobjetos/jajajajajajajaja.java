package pruebaobjetos;

public class jajajajajajajaja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto carrito = new Auto("verde" ,"tacoma",4,120, false);
		Auto autito = new Auto("naranja" ,"toyota",4,50,true );
   carrito.arrancarMotor();
   autito.arrancarMotor();
   autito.getColor();
   String colorDelAuto=carrito.getColor();
   System.out.println("elcolor del auto es ;"+ colorDelAuto);
    double i = carrito.acelerar(55);
    System.out.println("la nueva velociadad es:" +i);
	}
}