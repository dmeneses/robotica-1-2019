
public class Traductor {
	public String traducirMorse(String Morse){
		String laLetra= "a";
		if(laLetra== "a"){
		Morse =laLetra;
		}
	return Morse;
	}
	public String traducirPalabraMorse(String morse2){
		String traducido= "pan";
		if(traducido== "pan"){
			morse2 = traducido;
		}
		
		return morse2 ;
	}
    public String traducirLacadena(char[] morse3){
    	char espacio=' ';
    	int guardarEspacio=0;
    	int inicio=0;
    	String resultado= " ";
    	String porcion  = " ";
          for (int i = 0;i<=morse3.length;i++){
        	  if (morse3[i]==' '){
        		  guardarEspacio=i;
        		  for(int j = inicio;j<=guardarEspacio;j++){
        			  porcion= porcion +morse3[j]; 
        		  }
        		  inicio=guardarEspacio +1;
        	  }
        	  resultado=resultado + porcion;
        	  
          }
    	System.out.println(resultado);
    	return resultado;
    }
}
