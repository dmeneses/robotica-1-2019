package morse;

public class Traductor {
	
	Auto auto;
	
	public Traductor(Auto auto){
		this.auto = auto;
	}
	
	public void traducirCodigoMorse(String[]codigoMorse) {
		String[]Arreglo=codigoMorse;
		
		int tamaño=Arreglo.length;
		String nuevo="";
		for (int i = 0; i < tamaño; i = i + 1) {
			
		String cont=Arreglo[i];
		switch(cont){
			
		case ".-..": char l='L';nuevo=nuevo+l;;break;
		case ".-":char a='A';nuevo=nuevo+a;break;
		case "--": char m='M';nuevo=nuevo+m;break;
		
		}
				
		}
		System.out.println(nuevo);
}
}