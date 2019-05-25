public class Cadenas {
	int obtenerTamaño(String c) {
		int tamaño = c.length();
		return c.length();
	}

	char obtenerCaracterEnUnaPosicion(String a, int b) {
		char vacio = ' ';
		int tam = a.length();
		if (b > tam) {
			return vacio;
		} else {
			char unCaracter = a.charAt(b);
			return unCaracter;
		}
	}
	void vocales(String v) {
		for(int cont=0; cont<v.length(); cont=cont+1){
			char vocal = v.charAt(cont);
		if(vocal=='a'){
			System.out.println(cont);}
		if(vocal=='e'){
			System.out.println(cont);}
		if(vocal=='i'){
			System.out.println(cont);}
		if(vocal=='o'){
			System.out.println(cont);}
		if(vocal=='u'){
			System.out.println(cont);}
		}	
	}
	
	
	void vocales2(String v) {
		String vacio=" ";
		String a = "A";
		String e="E";
		String i="I";
		String o="O";
		String u="U";
		for(int cont=0; cont<v.length(); cont=cont+1){
		char vocal = v.charAt(cont);
		switch(vocal){
		case 'a':
			{vacio= vacio+"A";}
			break;
		case 'e':
			{vacio= vacio+"E";}
			break;
		case 'i':
			{vacio= vacio+"I";}
			break;
		case 'o':
			{vacio= vacio+"O";}
			break;
		case 'u':	
			{vacio= vacio+"U";}
			break;	
		default:
			{vacio=vacio+vocal;}
			break;
		}
		}
		System.out.println(vacio);
	}
	void contarVocales(String v){
		char[] letra={'a','e','i','o','u'};
		int contador=0;
		for (int contc=0; contc<v.length(); contc=contc+1){
			char caracter = v.charAt(contc);
			for (int cont=0; cont<letra.length; cont= cont+1){
				char letra1= letra[cont];
				if(caracter==letra1){
					contador=contador+1;
				}
			}
		}
		System.out.println("La cantidad de vocales es "+contador);
	}
}

	


