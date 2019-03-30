
public class Perro {
	//propiedades(estado)
	String nombre;
	int edad;
	String color;
	String raza;
	
	//metodos (comportamiento)
	public void hacerTrucos(char truco)
	{
		if(truco == 'v')
		{
		System.out.println("El perro " + nombre + " hace volteretas");
		}
		else if(truco == 'm')
		{
			
			System.out.println("El perro " + nombre + " se hace al muerto");
		}
		else 
		{
			System.out.println("El perro " + nombre + " salta");
		}
	}
	public void comer()
	{
		System.out.println("El perro " + nombre + " esta comiendo");
	}
	public void dormir()
	{
		System.out.println("El perro " + nombre + " esta durmiendo");
	}
	public void cavar()
	{
		System.out.println("El perro " + nombre + " esta cavando");
	}
}
