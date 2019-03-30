
public class Libroej {

	public static void main(String[] args) 
	{
		Libro libro1;
		libro1 = new Libro();
		
		libro1.nombre = "Sinsajo";
		libro1.color = "rojo";
		libro1.categoria = "ficcion";
		libro1.paginas = 400;
		libro1.paginaactual = 200;
		
		libro1.abrir();
		libro1.sabercuantofalta();
		libro1.cerrar();
		

	}


}
