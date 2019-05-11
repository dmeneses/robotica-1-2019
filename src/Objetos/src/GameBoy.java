
public class GameBoy {
	public static void main(String[] args){
		ConsolaDeVideojuegos gameboy = new ConsolaDeVideojuegos(100000);
		int gb=gameboy.calcularAlmacenamientoEnG();
		System.out.println(gb);
		
	}

}
