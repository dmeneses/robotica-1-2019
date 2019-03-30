
public class Principal {

	public static void main(String[] args) 
	{
		//creacion de objeto perro (nuevo tipo)
		
		//int edad;
		//boolean encendido;
		//double perimetro;
		//*EV3UltrasonicSensor ojos;
		//ojos = new EV3UltrasonicSensor(SensorPort.S1;)
		
		Perro perro1;
		perro1 = new Perro();
		perro1.nombre = "Sam";
		perro1.edad = 21;
		perro1.color = "amarillo";
		perro1.raza = "Buscador";
		
		Perro perro2;
		perro2 = new Perro();
		perro2.nombre = "Luna";
		perro2.edad = 14;
		perro2.color = "ploma";
		perro2.raza = "no tiene";
		
		perro1.comer();
		perro2.hacerTrucos('m');
		
		
	}

}
