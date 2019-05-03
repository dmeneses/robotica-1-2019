package hola;

import java.util.HashMap;
import java.util.Map;

public class thefish
{
	 

	  public static Map getDiferencia(java.util.Date fecha1, java.util.Date fecha2){
	   java.util.Date fechaMayor = null;
	   java.util.Date fechaMenor = null;
	   Map resultadoMap = new HashMap();
	 
	   /* Verificamos cual es la mayor de las dos fechas, para no tener sorpresas al momento
	    * de realizar la resta.
	    */
	   if (fecha1.compareTo(fecha2) > 0){
	    fechaMayor = fecha1;
	    fechaMenor = fecha2;
	   }else{
	    fechaMayor = fecha2;
	    fechaMenor = fecha1;
	   }
	 
	  //los milisegundos
	   long diferenciaMils = fechaMayor.getTime() - fechaMenor.getTime();
	 
	   //obtenemos los segundos
	   long segundos = diferenciaMils / 1000;
	 
	   //obtenemos las horas
	   long horas = segundos / 3600;
	 
	   //restamos las horas para continuar con minutos
	   segundos -= horas*3600;
	 
	   //igual que el paso anterior
	   long minutos = segundos /60;
	   segundos -= minutos*60;
	 
	   //ponemos los resultados en un mapa :-)
	   resultadoMap.put("horas",Long.toString(horas));
	   resultadoMap.put("minutos",Long.toString(minutos));
	   resultadoMap.put("segundos",Long.toString(segundos));
	   return resultadoMap;
	}
	 
	  public static void main(String[] args) {
	   //5:30:00 de Noviembre 10 - 1950 GMT-05:00
	   java.util.Date fecha1 = new java.util.Date(-604070999750L);
	 
	   //6:45:20 de Noviembre 10 - 1950 GMT-05:00
	   java.util.Date fecha2 = new java.util.Date(-604066478813L);
	 
	   //Luego vemos como obtuve esas fechas
	   System.out.println(getDiferencia(fecha1, fecha2));
	  }
	}
      


		
