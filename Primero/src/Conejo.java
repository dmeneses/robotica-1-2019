
public class Conejo {
	int edad;
	int tamaño;
	String genero;
	String nombre;
	boolean despierto;
	
	public void saltar()
	{
		System.out.println( nombre + "esta saltando");
	}
	
	public void comer()
	{
		System.out.println( nombre + "esta comiendo");
	}
	
	public void dormir()
	{
		if(despierto == true)
		{
		  System.out.println( nombre + "esta durmiendo");
		}
		else
		{
			System.out.println(nombre + " ya esta dormido");
		}
	}

}
