import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class TesteadorRobot {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor lapiz = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3TouchSensor sensorTouchD =new EV3TouchSensor(SensorPort.S3);
		EV3TouchSensor sensorTouchI =new EV3TouchSensor(SensorPort.S2);
		SampleProvider muestrasCapturadasTouch = sensorTouchD.getTouchMode();
		SampleProvider muestrasCapturadasTouch1 = sensorTouchI.getTouchMode();
		char[] letras={};
		ConvertidorMorse convertidor = new ConvertidorMorse();
		String palabra = "robot en clave morse";
		char[] arreglo = convertidor.convertirStringEnArreglo(palabra);
		for(int piso=0; piso < arreglo.length; piso = piso +1)
		{
			System.out.println(arreglo[piso]);
		}
		String caracter = palabra;
		String letraO = "o";
		String cambiarPor1 = "_ _ _";
		if(caracter == letraO){
			caracter = cambiarPor1 ;
		}
		String letra = "a";
		String cambiarPor8 = "._";
		String letraB = "b";
		String cambiarPor2 = "_ ...";
		String letraC = "c";
		String cambiarPor7 = "_._.";
		String letraD = "d";
		String cambiarPor12 = "_ _.";
		String letraE = "e";
		String cambiarPor5 = ".";
		String letraF = "f";
		String cambiarPor13 = ".._.";
		String letraG = "q";
		String cambiarPor14 = "_ _.";
		String letraH = "h";
		String cambiarPor15 = "....";
		String letraI = "i";
		String cambiarPor16 = "..";
		String letraJ = "j";
		String cambiarPor17 = "._ _ _";
		String letraK = "k";
		String cambiarPor18 = "_._";
		String letraL = "l";
		String cambiarPor3 = "._..";
		String letraM = "m";
		String cambiarPor10 = "_ _";
		String letraN = "n";
		String cambiarPor6 = "_.";
		String letraO = "o";
		String cambiarPor1 = "_ _ _";
		String letraP = "p";
		String cambiarPor19 = "._ _ .";
		String letraQ = "q";
		String cambiarPor20 = "_ _ ._";
		String letraR = "r";
		String cambiarPor = "._.";
		String letraS = "s";
		String cambiarPor11 = "...";
		String letraT = "t";
		String cambiarPor4 = "_";
		String letraU = "u";
		String cambiarPor21 = ".._";
		String letraV = "v";
		String cambiarPor9 = "..._";
		String letraW = "w";
		String cambiarPor29 = "._ _";
		String letraX = "x";
		String cambiarPor22 = "_.._";
		String letraY = "y";
		String cambiarPor23 = "_._ _";
		String letraZ = "z";
		String cambiarPor24 = "_ _..";
		
		
		
		char[] codificado = convertidor.codificarPalabra(palabra,letraABuscar,cambiarPor);
		
		String aPartirDeArreglo = new String(codificado);
		System.out.println(aPartirDeArreglo);
		
		char[] miArreglo = aPartirDeArreglo.toCharArray();
		for(int piso=0; piso < arreglo.length; piso = piso +1)
		{
			System.out.println(miArreglo[piso]);
		}
		

	}

}
