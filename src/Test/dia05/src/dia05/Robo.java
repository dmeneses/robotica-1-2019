package dia05;



public class Robo 
{

	int estatura;
	String color;
	Auto b;
	String[] lista_sensores; 
	
	

      public Robo (Auto bmovil, String[] lista)
      {
	    b = bmovil ;
	    lista_sensores = lista;
	     
      }
      
      public void encenderAuto()
      {
    	  b.arrancarAuto();
      }
      
      public void mostrarLista()
      {
    	  
    	 for(int i = 0; i <= 2 ; i++)
    	 {
    		
    	    
    		 System.out.println(lista_sensores[i]);
    	 }
      }
 
   
}
