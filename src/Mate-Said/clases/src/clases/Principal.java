package clases;

public class Principal {

	public static void main(String[] args) {
		
		Auto carro = new Auto("toyota", "rojo", 25 );
        Auto radio = new Auto("bmw", "negro" , 30);
		
		
		carro.arrancar();
		String color = carro.color();
		
		
		
		carro.velocidad();
		radio.arrancar();
		radio.color();
		radio.velocidad();
		
		System.out.println(carro);
	}
 
	
	
}
