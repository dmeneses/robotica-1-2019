
public class Principal {
	public static void main(String[] args){
		
		Perro peluche = new Perro("Peluche "," Pekinés");
	
		peluche.ladrar();
		
		Perro coki = new Perro("Coki "," Chapi");
		
		coki.ladrar();
		
		ConsolaDeVideojuegos  playstation = new ConsolaDeVideojuegos(100000);
		int GB = playstation.calcularAlmacenamientoEnGB();
		System.out.println(GB);
		
		Circulo bonito= new Circulo(5);
		double perimetro = bonito.calcularPerimetro();
		System.out.println(perimetro);
	
		Contador incrementador= new Contador(1);
		int incrementar = incrementador.IncrementarContador();
		incrementar = incrementador.IncrementarContador();
		incrementar = incrementador.IncrementarContador();
		incrementar = incrementador.IncrementarContador();
		int decrementar2 = incrementador.DecrementarContador();
		System.out.println(incrementar);
		System.out.println(decrementar2);
		
		Contador decrementador = new Contador(1);
		int decrementar = decrementador.DecrementarContador();
		System.out.println(decrementar);

	}
}
