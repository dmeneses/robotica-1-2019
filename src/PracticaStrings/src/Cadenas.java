
public class Cadenas {
	
	int obtenerTamaño(String x){
		String X=x;
		int tamaño=X.length();
		return tamaño;
		}
   void obtenerPosicion(String x,int p){
	   
	   int tamaño=x.length();
	   if (p>tamaño){
		   System.out.println("no esta permitido");
	   }
	   else{
		   char po=x.charAt(p);
		   System.out.println(po);
	   }
   }
	void vocales(String x){	 
		int tamaño=x.length();
	
		for(int i=0;i<tamaño;i=i+1){
		char v=x.charAt(i);
		if(v=='a'|| v=='e' || v=='i' || v=='o' || v=='u'){
			char po=x.charAt(i);
			System.out.println(i);
		}
		}
	
		
	}
	void mayuscula(String x){
		int tamaño=x.length();
		String cres="";
		for(int i=0;i<tamaño;i=i+1){
		char v=x.charAt(i);
		if (v=='a'){
			v='A';}
		if (v=='e'){
			v='E';}
		if (v=='i'){
			v='I';}
		if (v=='o'){
			v='O';}
		if (v=='u'){
			v='U';}
		cres=cres+v;
		}
		System.out.println(cres);
		}
	void numeroVocales(String x){
        int tamaño=x.length();
		int con=0;
		for(int i=0;i<tamaño;i=i+1){
		char v=x.charAt(i);
		
		if(v=='a'|| v=='e' || v=='i' || v=='o' || v=='u'){
		con=1+con;
		
		}
		
	}
				
		System.out.println(con);
   }
	void alReves(String x){
		int tamaño=x.length();
		String c="";
		for(int i=tamaño-1;i>=0;i=i-1){
			char v=x.charAt(i);
			c=c+v;
		}
		System.out.println(c);
	}
	void caracter(String x, char y){
		int tamaño=x.length();
		int z=0;
		for(int i=0;i<tamaño;i=i+1){
			char v=x.charAt(i);
			if (v==y){
				z=z+1;
			}
			
		}
		System.out.println(z);
	}
	void iniciales(String N){
		String n=N;
		String a="";
		char z=' ';
		char b=n.charAt(0);
		int tamaño=n.length();
		char c=' ';
		for(int i=0;i<tamaño;i=i+1){
			char v=n.charAt(i);
			
			if (v==c){
				z=n.charAt(i+1);
				if (z==c){
				   
				}
				else {
					a=a+z;}
				}
			
}
		System.out.println(b+a);
		}
	void anagrama(String x, String y){
		
		char b=x.charAt(0);
		int tamaño=x.length();
		char v=' ';
		boolean ver=true;
		
		char z=y.charAt(0);
		int tam1=y.length();
		
		for(int i=0;i<tam1;i=i+1){
			v=x.charAt(i);
			v=v++;
			}
		char [] u={v};
		for(int i=0;i<tamaño;i=i+1){
			
			v=x.charAt(i);
			
			}
		
		
		}}
		
		
	
   
