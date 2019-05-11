import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class CarritoDibujarLu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerodeTramos = 2;
		double distanciaLapizArriba = 20; //20cm
        double distanciaLapizAbajo = 30;  // 30cm
        
        EV3LargeRegulatedMotor MotorDerecho;
        EV3LargeRegulatedMotor MotorIzquierdo;
        EV3LargeRegulatedMotor lapiz;
        
        MotorDerecho= new EV3LargeRegulatedMotor(MotorPort.C);
        MotorIzquierdo= new EV3LargeRegulatedMotor(MotorPort.B);
        lapiz= new EV3LargeRegulatedMotor(MotorPort.D);
        System.out.println("Presione cualquier boton para empezar");
        Button.waitForAnyPress();
        
        int gradosdistanciaLapizArriba= 0;
        int gradosdistanciaLapizAbajo= 0;
        int gradoslapiz =100;
      
         
        int distanciaAlObstaculo=30;
		double distancia = distanciaAlObstaculo*100;
		 if( distancia!= Float.POSITIVE_INFINITY);
        int grados=0;
        double diametro= 5.5;
         double diametroderueda = 0;
		double circunferencia= Math.PI * diametroderueda;
         double numerodeRotaciones = distancia/circunferencia;
         grados = (int)(numerodeRotaciones*360 );
         
         double distancia1=distanciaLapizAbajo;
         double numerodeRotaciones1 = distancia1/circunferencia;
         
         int tramosTerminados =0;
        while (tramosTerminados < numerodeTramos){
        	float lapiz1 = Float.POSITIVE_INFINITY;
        	
        	
        }
         
         
         
       
          

			MotorDerecho.rotate(grados, true);
			
			MotorIzquierdo.rotate(grados); 
			
			MotorDerecho.close();
			MotorIzquierdo.close();
			lapiz.close();
			System.out.println("Presione cualquier boton para terminar");
	        Button.waitForAnyPress();
         
         
          
         
         
         
        
        
        
      

	}

	            

}
