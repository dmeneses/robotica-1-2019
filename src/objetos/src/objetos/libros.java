package objetos;

public class libros {

	String titulo;
	String autor;
	String paginas;
	int ISBN;
	int numeroPaginas;
	boolean estaprestado;

	boolean prestar(){
	 estaprestado = true;
	 if(estaprestado==true){
		return true; 
	 }
	}

	boolean devolver() {
		 estaprestado = false;
		 if (estaprestado == true){
			 
			return 
		 }

		 
	}

	boolean estaPrestado1() {
        return estaprestado; 
	}

}
