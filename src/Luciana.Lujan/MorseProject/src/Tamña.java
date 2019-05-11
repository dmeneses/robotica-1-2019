
public class Tamña {
	//esto es de Prueba robot devolvera ahi
	Robot robot= new Robot ();
	
	bool terminarCodigo = false;
	
	char [] codigoEnMorse = new char [200];
	int contadorCaracter = 0;
	while (terminarCodigo == false){
		terminarCodigo = robot.detectarSenialTerminar();
		System.out.println("terminarCodigo="+ terminarCodigo);
		char caracter =robot.robot.pedirDatosAlPulsadorCodigo();
		System.out.println("caracter ="+ caracter);
		codigoEnMorse[contadorCaracter]= caracter;
		contadorCaracter = contadorCaracter + 1;
		
	System.out.println("termine de ingresar codigo Morse");
	for(int i= 0; i< codigoEnMorse.length; i= i+1);{ 
			System.out.println(codigoEnMorse[i]);
		
	}
	
		

}

}
