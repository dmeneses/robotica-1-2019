import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;


public class ChallengeMorse {
	
	public static void main(String[] args) {
		MovimientoLapiz lapiz = new MovimientoLapiz();
		CodigoMorse Codigo = new CodigoMorse(); 
		Pulsadores pulsar = new Pulsadores();
		carro Carro = new carro();
		String codigoString = ""; 
	    boolean terminarCodigo = false;
	    char[] CodigoMorse = new char[200];
     	int contadorCaracter = 0;
	    while(terminarCodigo == false){		      
	    	terminarCodigo = pulsar.pedirDatosAlPulsadorTerminar();
		    char caracter = pulsar.pedirDatosAlPulsadorCodigo();
		    System.out.println( caracter);
		    CodigoMorse[contadorCaracter] = caracter;
		    contadorCaracter = contadorCaracter +1;
	}
	    System.out.println( contadorCaracter);
	    Button.waitForAnyPress();
	    
	    //2.- imprimir palabra en español
	    String codigoTraducido = Codigo.convertirCodigo(codigoMorse);
	    System.out.println(codigoTraducido);
	    
	    //3.-dibujar codigo cifrado
	    lapiz.dibujarCodigo(codigoString);
	    

	}	
}
