
public class Dibujante {
      Auto auto;
      public Dibujante(Auto auto){
    	  this.auto = auto;
    	  
      }
      public void dibujarCodigoMorse(String codigoMorse){
    	  
  		for (int con = 0; con < codigoMorse.length(); con = con + 1) {
  			char ñ = codigoMorse.charAt(con);

  			switch (ñ) {

  			case '-':
  				 auto.dibujarLinea();
                

  				break;

  			case '.':
  				auto.dibujarPunto();

  				break;
    	  
  			}
  		}
      }
}
