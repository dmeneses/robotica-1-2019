
public class ConsolaDeVideojuegos {
	
	int AlmacenamientoMB;
	
	String marca;
	
	ConsolaDeVideojuegos(int a){
		
		AlmacenamientoMB = a;
	}
	

	int calcularAlmacenamientoEnGB(){
		int cantidadGB = (AlmacenamientoMB)/1024;
		
		
		return cantidadGB;
	}
}
