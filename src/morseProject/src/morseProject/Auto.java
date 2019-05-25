package morseProject;

public class Auto {
	Marcador marcador;
	public Auto(){
		marcador=new Marcador();
	}
	public void AvanzarCm(int cm){
		
	}
	public void dibujarPunto(){
		marcador.bajarMarcador();
		AvanzarCm(2);
		marcador.subirMarcador();
	}

	public void dibujarLinea(){
		marcador.bajarMarcador();
		AvanzarCm(6);
		marcador.subirMarcador();
	}
}
