
public class Traductor {
	public String  traductorAtexto(String[] arreglo){
	//for (int con = 0; con < c.length(); con = con + 1) {
		
			String palabra="";
			for(int con = 0 ; con < arreglo.length; con = con +1){
				 String codigo = arreglo[con];
				
				
			
			switch (codigo) {
			
			case "....":
				palabra = palabra + "H";
				break;
			case ".-..":
				palabra = palabra + "L";
				break;
			case ".-" :
				palabra=palabra+ "A";
				 break;

			case ".":
				palabra=palabra +"E";
		        break;
			case "..":
				palabra=palabra + "I";
				break;
			case "---":
				palabra=palabra +"O";
				break;
			case "..-":
				palabra=palabra + "U";
				
				break;
			default:
				palabra=palabra + "";
				break;
			}
	//}
			}
			return palabra;
	}
}
