
public class CodigoMorse {
	
	
	public String convertirCodigo (String codigoMorse){
		String letras = "abcdefghiklmnñopqrstuvwxyz";
		codigoMorse = codigoMorse.toLowerCase();
		String codigo[] = new String[25];
		String morse = "";
		String espacio = "";
		
		codigo[0] = " .- ";
		codigo[1] = " -... ";
		codigo[2] = " -.-. ";
		codigo[3] = " -.. ";
		codigo[4] = " ..-. ";
		codigo[5] = " -.. ";
		codigo[6] = " .... ";
		codigo[7] = " .. ";
		codigo[8] = " .--- ";
		codigo[9] = " -.- ";
		codigo[10] = " .-.. ";
		codigo[11] = " -- ";
		codigo[12] = " -. ";
		codigo[13] = " --- ";
		codigo[14] = " .--. ";
		codigo[15] = " --.- ";
		codigo[16] = " .-. ";
		codigo[17] = " ... ";
		codigo[18] = " - ";
		codigo[19] = " ..- ";
		codigo[20] = " ...- ";
		codigo[21] = " .-- ";
		codigo[22] = " -..- ";
		codigo[23] = " -.-- ";
		codigo[24] = " --.. ";
		codigo[25] = " --.. ";
		
		for(int i = 0; i < codigoMorse.length(); i++){
			if(morse.charAt(i) == ' '){
		
			}
			
			
			
	}
		return morse;
	}
}


	


