package objetos;

public class consola {
    
     int almacenamientoMB;
     consola(int a){
    	 almacenamientoMB = a;
     }
   int calcularAlmacenamientoGB(){
	   int cantidadGB = almacenamientoMB / 1024;
	   return cantidadGB;
   } 
}
