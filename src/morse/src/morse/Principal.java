package morse;

import lejos.hardware.Button;

public class Principal {
	public static void main(String []args){
		/*Auto auto = new Auto();
		Dibujante dibujante = new Dibujante(auto);
		
		String codigoMorse = "._ _";
		dibujante.dibujarCodigoMorse(codigoMorse);*/
		
		
		Auto marcador=new Auto();
        Lector traductor=new Lector(marcador);
        traductor.marcarPunto();
        
        
	}

}

