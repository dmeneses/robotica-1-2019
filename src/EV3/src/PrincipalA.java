import lejos.hardware.Button;


public class PrincipalA {
	public static void main(String[] args) {
	 int[] azul = {70,30,-100,30,30};
	 int[] verde= {-50,30,120,30,-70};
	 int[] rojo={20,30,-90,30,70};
	 int[] amarillo={60,30,-120,30,60};
	 Avanzar robot=new Avanzar();
	 int c=0;
	 int x=4;
	 
	 while(true){
	 robot.color();
		
		c=robot.color();
		
		System.out.println(c);
		switch (c){
		
		case 2: robot.algo(azul);robot.otro();System.out.println("azul");Button.waitForAnyPress();x=6;break;
		case 1: robot.algo(verde);robot.otro();System.out.println("verde");Button.waitForAnyPress();x=6;break;
		case 3: robot.algo(amarillo);robot.otro();System.out.println("amarillo");Button.waitForAnyPress();x=6;break;
		case 0: robot.algo(rojo);robot.otro();System.out.println("rojo");Button.waitForAnyPress();x=6;break;
		default:System.out.println("por defecto");break;
		}
		}
	
		
		
	   }
	}

