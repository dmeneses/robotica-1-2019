
public class Auto {
	Marcador  marcador;
public Auto(){
	
	marcador = new Marcador();
	
}	
  public void avanzarCm (int centimetros){
	  
	  
  }
  public void dibujarPunto(){
	  marcador.bajarMarcador();
	  avanzarCm(2);// un punto sera 2 centrimetros .
	  marcador.subirMarcador();
	  
  }
  public void dibujarLinea(){
	  marcador.bajarMarcador();
	  avanzarCm(6); //una linia sera 6 centimetros -
	  marcador.subirMarcador();
	  
  }
}
