package morse;

public class robot2 {
	double telegrafo; 
	String pal = "....*---*.-..*.-";
	String h = "....";
	String o = "---";
	String l= " .-..";
	String a= ".-";
	public static void main (String[]args){
	/* System.out.println("hola");*/
		String morse= "saludo";
		System.out.println("largo: " + morse.length());
	    for (int x=0;x<morse.length();x++)
	        System.out.println("Caracter " + x + ": " + morse.charAt(x));
	    String pal = "....*---*.-..*.-";
	    //for (int x=0;x<pal.length();x++)
	    	int x = 0;
	    	while(x<pal.length())
	    	{
	    		System.out.println("Caracter " + x + ": " + pal.charAt(x));
	    		x = x + 1;
	    	}
	        
	   System.out.println(morse.charAt(3));
	}
}
