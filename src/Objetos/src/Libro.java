
public class Libro {
	
	String titulo;
	String autor;
	String ISBN;
	int numeroDePaginas;
	boolean estaPrestado;
	boolean prestar;
	boolean devolver;
	
	Libro(String t, String a, String Cod, int NP, boolean EP, boolean P, 
			boolean D)
	{
		titulo=t;
		autor=a;
		ISBN= Cod;
		numeroDePaginas = NP;
		estaPrestado=EP;
		prestar=P;
		devolver= D;
		
	}
	void Libros()
	{
		
		System.out.println("Libro "+titulo+" escrito por "+autor+"de codigo "+ ISBN
				+ "y tiene "+numeroDePaginas+ " paginas");
		System.out.println(estaPrestado);
		
		
	}
}
