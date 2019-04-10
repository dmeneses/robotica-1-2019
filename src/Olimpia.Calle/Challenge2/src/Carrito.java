import lejos.hardware.ev3.EV3;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;


public class Carrito {
	EV3ColorSensor sensorColor= new EV3ColorSensor(SensorPort.S1); 
	 EV3largeRegulatedMotor motorA=new EV3largeRegulatedMotor(MotorPort.A);
	 EV3largeRegulatedMotor motorB=new EV3largeRegulatedMotor(MotorPort.B);
	double diametro=5.5;
  public float detectarColor(){
	  SampleProvider muestrasCapturadasColor=sensorColor.getColorIDMode();
	  float[]datosDelSensor= new   float[muestrasCapturadasColor.sampleSize()];
	  muestrasCapturadasColor.fetchSample(datosDelSensor,0);
	  float color = datosDelSensor[0];
	  System.out.println("color="+color);
	  return color;
  }
	  
	  public void avanzar(Double siatansia){
		  //calcular el angulo de giro
		  int grado=0;
		  
		  
	  
	}
}
