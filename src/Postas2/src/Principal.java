
public class Principal {
	public static void main(String[] args){
		
	EV3 bendi = new EV3 ();
	
	int[] cm = {50,90,50,90,50,90,50};
	for (int cont=0; cont<=6; cont= cont+1){
		int avanzarGirar = cm[cont];
		
		if(cont%2==0){
			bendi.avanzarcm(avanzarGirar);
			}
			else{
				bendi.girarDer(avanzarGirar);
			}
	}
	}
}