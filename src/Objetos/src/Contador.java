
public class Contador {
	
	int inicio;
	
	Contador(int i){
		
		inicio=i;

	}
	int IncrementarContador(){
	
		inicio= inicio+1;
		
		return inicio;
		
	}
	
	int DecrementarContador(){
		
		inicio=inicio-1;
		
		return inicio;
	}


	}


