import lejos.hardware.Button;


public class PrincipalColor {

	public static void main(String[] args) {
		
		EV3 miEV3 = new EV3();
		
		while(true){
			int color = miEV3.obtenerColor();
			System.out.println(color);		
			switch (color) {
			case 0: miEV3.girarDer(360); break;
			case 1: miEV3.avanzarcm(-50); break;
			case 2: miEV3.avanzarcm(50); break;
			case 3: miEV3.girarDer(90); break;
			default:System.out.println("por defecto");
	
	}

}
	}
	}

