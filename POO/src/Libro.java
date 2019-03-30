
public class Libro 
{
	int paginas;
	String color;
	String categoria;
	String nombre;
	int paginaactual;
	
	public void abrir()
	{
		System.out.println("El libro " + nombre + " se abrio en la pagina " + paginaactual);
	}
	public void sabercuantofalta()
	{
		int pagfaltantes;
		pagfaltantes = paginas - paginaactual;
		System.out.println("Faltan " + pagfaltantes + " paginas por leer del libro " + nombre);
	}
	public void cerrar()
	{
		System.out.println("El libro " + nombre + " se cerro");
	}
}
