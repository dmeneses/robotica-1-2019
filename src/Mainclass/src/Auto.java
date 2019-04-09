
public class Auto {
	int nroventanas;
	String color;
	String marca;
	double tvelocidad;
	boolean ensendido; 

public Auto(String unColor, String unaMarca, int ventanas,double velocidad,boolean Estaensendido){
	color = unColor; 
	marca = unaMarca;
	nroventanas=ventanas;
	tvelocidad= velocidad;
	ensendido= Estaensendido;
	
	
}

	public void arrancarMotor(){
		ensendido = true;
		System.out.println("brrrr.......");
	}

	public String getColor() {
		System.out.println(color);
		return color;
	}

	public double acelerar(double i) {
		
		tvelocidad =tvelocidad+i;
		return tvelocidad;
	}

}
