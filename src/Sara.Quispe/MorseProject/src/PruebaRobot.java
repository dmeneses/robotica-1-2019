import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

 
public class PruebaRobot {
public static void main(String[] args) { 
	
     Robot Robot=new Robot();
     boolean terminarCodigo=false;
     char[] codigoEnMorse=new char[20];
     int contadorCaracter=0;
     while (terminarCodigo==false){
        terminarCodigo=Robot.pedirDatosAlPulsadorTerminar();
	    System.out.println("terminarCodigo ="+ terminarCodigo);
	    char caracter=Robot.pedirDatosAlPulsadorCodigo();
     	System.out.println("caracter ="+caracter);
     	codigoEnMorse[contadorCaracter]=caracter;
    	contadorCaracter=contadorCaracter + 1;
   }
 
     System.out.println("termine de ingresar codigo morse");
     for(int i=0;i<codigoEnMorse.length;i=i+1){
	 System.out.println(codigoEnMorse[i]);
 
     }
   }
}
