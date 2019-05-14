package postasFin3;

import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class ProgramaBase {
	String punto;
	String guion;
	int avanzar;
	int distancia;
	Robot bot;
	String codigo;
	Map morse;
	public ProgramaBase(){
		punto = ".";
		guion = "-";
		avanzar = 30;
		distancia = 30;
		bot = new Robot(3);
		codigo = "";
		
	morse = new HashMap();
	morse .put(".-","a");
	morse .put("-...","b");
	morse .put("-.-.","c");
	morse .put("-..-","d");
	morse .put(".","e");
	morse .put("..-.","f");
	morse .put("--.","g");
	morse .put("....","h");
	morse .put("..","i");
	morse .put(".---","j");
	morse .put("-.-","k");
	morse .put(".-..","l");
	morse .put("--","m");
	morse .put("-.","n");
	morse .put("---","o");
	morse .put(".--.","p");
	morse .put("--.-","q");
	morse .put(".-.","r");
	morse .put("...","s");
	morse .put("-","t");
	morse .put("..-","u");
	morse .put("...-","v");
	morse .put(".--","w");
	morse .put("-..-","x");
	morse .put("-.--","y");
	morse .put("--..","z");
	
	}
	public void recibirCodigoMorse(){
		

		SampleProvider sp = bot.sensorCodigo.getTouchMode();
		SampleProvider sp2 = bot.sensorTerminar.getTouchMode();
		boolean botonActivado;
		boolean botonTerminar;
		boolean contando = false;
		Stopwatch reloj = new Stopwatch();
		int pushTime;
		while(true){
			float[] sample = new float [sp.sampleSize()];
			sp.fetchSample(sample, 0);
			if (sample[0] == 0){
				botonActivado = false;
				}else{
			
					botonActivado = true;				
					
			}
			float[] sample2 = new float [sp2.sampleSize()];
			sp2.fetchSample(sample2, 0);
			if (sample2[0] == 0){
				botonTerminar = false;
				}else{
			
					botonTerminar = true;				
					
			}
			if (botonTerminar)
			{
				System.out.println("segundo pulsador ");
				Delay.msDelay(2000);
				dibujarCodigo();
			}
			
			if(botonActivado && !contando)
			{
				reloj.reset();
				contando = true;
			}
			if(!botonActivado && contando)
			{
				pushTime = reloj.elapsed();
				guardarCodigo(pushTime);
				traducir("");
				System.out.println(pushTime);
				Delay.msDelay(1000);
				contando = false;
			}
			
			System.out.println(botonActivado);
			
		}
		
		
	
	
	}
	public void dibujarCodigo()
	{
		codigo
	}
	public void traducir (String traduccion){
		List<String> codigoLista = new ArrayList<String>(Arrays.asList(codigo.split(" ")));
		
		
		for (String i:codigoLista)
		{
			morse.get(i);
		
		traduccion=  traduccion + morse.get(i);
			
	}
		System.out.println(traduccion);
		Delay.msDelay(1000);
	}
	public void guardarCodigo (int tiempo)
	{
		if (tiempo > 0 && tiempo < 500)
		{
			codigo = codigo + ".";
		}
		
		if (tiempo > 500 && tiempo < 2000)
		{
			codigo = codigo + "-";
		}
		if(tiempo > 3000)
		{
			codigo = codigo + " ";
		}
		System.out.println(codigo);
		Delay.msDelay(2000);
	}
	
	
	
	
	public void operacion(String simbolo)
	{
	if (punto == simbolo){
		bot.dibujarPunto();
	}
	else
	{
		bot.dibujarGuion(avanzar);
	}
		
		
		
	}
	

}
