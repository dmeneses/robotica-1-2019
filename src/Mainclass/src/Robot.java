
public class Robot {
	Auto autito;
	int nroderuedas;
	String color;
	double tvelocidad;
	int motor;
	boolean ensendido; 
	String[] listaSen;
public Robot(String unColor, int unmotor, int ruedas,double velocidad,boolean Estaensendido, Auto auto,String[] listasen){
	autito= auto;
	color = unColor; 
	motor = unmotor;
	nroderuedas=ruedas;
	tvelocidad= velocidad;
	ensendido= Estaensendido;
	listaSen=listasen;
}
  
	public String getColor() {
		System.out.println(color);
		return color;
	}
	public void arrancarMotor() {
		autito.arrancarMotor();
		
	}
 

 public void listarSensores (){
	 for (int i=0 ; i<3 ;i++){
		 System.out.println(listaSen[i]);
	 } 
 }
	
}
