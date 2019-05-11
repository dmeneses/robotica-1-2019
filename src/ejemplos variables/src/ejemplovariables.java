import java.util.Scanner;


public class ejemplovariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Ingresar nota: ");
	    
	    int nota = scanner.nextInt();
	    
	    
	    //int nota1 = 65;
	    //int aprobado = 71;
	    //int reprobado = 70;
	    
	    if (nota <= 71)
	    {
	    	if( nota < 71 && nota > 50)
		     {
		    	 System.out.println("reforsamiento");
		     }
	    	if(nota < 50)
	    	{
	    		System.out.println("reprobado");
	    	}
	    	
	    	
	    }
	    else{
	    	
	    	System.out.println("aprobado");
	    
	    }
	    
	    
	     
	    
	    	
	    	
	    
	}
}

