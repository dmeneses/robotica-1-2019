package clases;

public class Auto {
	
	String color;
	String marca;
	int velocidad;
	
	public Auto( String uncolor,String unamarca,int unavelocidad ){
		color = uncolor;
		marca = unamarca;
		velocidad = unavelocidad;
  
	}

	public String arrancar(){
		
	      return marca;
		
	}
	
	public String color(){
		
		 return color;
		
	}
	
    public int velocidad(){
		
		return velocidad;
		
    }
	
}