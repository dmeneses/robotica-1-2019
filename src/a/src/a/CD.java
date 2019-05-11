package a;

public class CD{
	String autor;
	int lista;
	String nombre;
	CD(int lis,String nom,String a){
		a=autor;
		nom=nombre;
		lis=lista;
				}
	
	void Listar(){
		int z=0;
	    String[] Ar={"Introduccion","Mi llama", "Como Conoci a Pedrito", "El juego de los Apostoles", "Mi abuelo"};
		for(int i=0;i<=3;i=i+1){
			String x=Ar[i];
			 z=i+1;
			
			System.out.println("La cancion "+z+" titula "+x);
		}

}

    void Posicion(int D){ 
    	 int d=D;
    	 int c=d+1;
    	String[] Ar={"Introduccion","Mi llama", "Como Conoci a Pedrito", "El juego de los Apostoles", "Mi abuelo"};
	
		
		
		String x=Ar[d];
		
		System.out.println("La cancion " +c+" es "+x);
	}
    
	void Devolver(){
		int z=0;
	    String[] Ar={"Introduccion","Mi llama", "Como Conoci a Pedrito", "El juego de los Apostoles", "Mi abuelo"};
		for(int i=0;i<=3;i=i+1){
			String x=Ar[i];
			 z=i+1;
			 System.out.println("Total de canciones es "+z);
		
	}
		
		
		
		}
	
}