import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class Dibujar {

		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
		EV3TouchSensor sensorTouch=sensorTouch=new EV3TouchSensor(SensorPort.S2);
		SampleProvider muestrasCapturadasTouch=  sensorTouch.getTouchMode();
		
		 boolean sensorTouchDetectoToque=false;
			
			while (sensorTouchDetectoToque==false){
				System.out.println("esperando a que pase algo");
			float[]datosDelSensor=new float [muestrasCapturadasTouch.sampleSize()];
			
			muestrasCapturadasTouch.fetchSample(datosDelSensor,0);
			
			if (datosDelSensor[0]==0);{
			
				System.out.println("0 equivale a que no hubo toque");
			}
			
			if(datosDelSensor[0]!= 0){
				System.out.println(datosDelSensor[0]+"equivale a que hubo un toque");
				sensorTouchDetectoToque=true;
				
			}
		}
			

				 
				if(sensorTouchDetectoToque==true){
					
					
				}
				


		}

		
		
		
		
		
		
	 
	}

}
