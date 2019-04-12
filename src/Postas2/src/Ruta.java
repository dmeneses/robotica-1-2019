
public class Ruta {
   int[] listarojo ;
   int[] listaverde ;
   int[] listaamarilo ;
   int[] listaazul ;
   float distancia;
   public Ruta(int[] rojo,int[] verde,int[]amarillo,int[]azul,float distanci){
	   listarojo=rojo;
	   listaverde=verde;
	   listaamarilo=amarillo;
	   listaazul= azul;
	   distancia=distanci;
   }
 
  public int[] devolverlistaRojo(){
	  
	  return listarojo;
	  
  }
  public float devolverdistancia(){
	  
	  return distancia;
  }
  
}

