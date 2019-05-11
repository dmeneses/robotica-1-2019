
public class ConsolaDeVideojuegos {
	int almacenamientoM;
	
	ConsolaDeVideojuegos(int M){
		almacenamientoM=M;
		}
	int calcularAlmacenamientoEnG(){
		int cantidadGB=almacenamientoM/1024;
		return cantidadGB;
	}

}
