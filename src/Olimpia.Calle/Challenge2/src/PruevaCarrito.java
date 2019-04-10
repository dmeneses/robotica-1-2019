
public class PruevaCarrito {

	public  static void main(String[]args){
		Carrito carritoSara=new Carrito();
		 float colorRojo=0.0f;
		 float colorAzul=2.0f;
		 float colorVerde=1.0f;
		 float colorAmarillo=3.0f;
		 float colorDetectado=-1;
		 while (colorDetectado!=colorRojo
				 ||colorDetectado!=colorAzul
				 ||colorDetectado!=colorVerde
				 ||colorDetectado!=colorAmarillo){
			 colorDetectado=carritoSara.detectarColor();
			 if(colorDetectado==0){
				 System.out.println("colorRojo!!");
			 }
		 }
		 System.out.println("colorDetectadoes"+ColorDetectado);
		 hay color
		 double distanciaAvance=100;
		 if(colorDetectado==colorAzul){
			 //distancia avansar
			 carritoSara.avanzar(distanciaAvance);
			 
			 
	
		}
			

   }
}