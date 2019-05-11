import lejos.hardware.Button;

public class PrincipalMorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Auto auto = new Auto ();		
                Dibujante dibujante = new Dibujante(auto);
                Traductor traductor = new Traductor();
               // String codigoMorse = ". _ _";
              //  dibujante.dibujarCodigoMorse(codigoMorse);
              //  Marcador marcador= new Marcador();
               //marcador.bajarMarcador();
		
			
				String[] codigos = {"....", "---",".-..",".-"};
					
				//".- ---" = AO
				String letra = traductor.traductorAtexto(codigos);
				
				System.out.println(letra);
				
				
				Button.waitForAnyPress();
                //Auto auto = new Auto();
                //auto.dibujarLinea();
               // auto.dibujarPunto();
	}
}
