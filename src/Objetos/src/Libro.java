
public class Libro {
	int ISBN;
	String autor;
	String titulo;
	int numPag;
	boolean prestado;
	
	Libro(String a,String t,int p,int I){
		a=autor;
		t=titulo;
		p=numPag;
		I=ISBN;
				}
	boolean prestar(){
		boolean c=true;
		prestado=c;
		System.out.println(prestado);
		return prestado;
	}
	boolean devolver(){
		boolean s=false;
		prestado=s;
		System.out.println(prestado);
		return prestado;
	}
	void estaPrestado(){
		if(prestado==true){
			System.out.println("el libro esta prestado");
		}
		else{
			System.out.println("el libro no esta prestado");
		}
	}
	}
	
	
	


