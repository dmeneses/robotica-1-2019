


public class sensorcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuedasGrados miauto = new RuedasGrados();
		
		while(true){
		int color = miauto.valor();
		
		switch(color){
		case 2: miauto.avanzarCm(50);break;//azul
		case 1: miauto.avanzarCm(-50);break;//verde
		case 3: miauto.GiraDerecho(90);break;//amarrillo
		case 0: miauto.girarIzq(360);break;//rojo
		default:miauto.avanzarCm(0);
		
		
		}		
		
		
		}
		
		
		
		
		
		
	}

	

}
