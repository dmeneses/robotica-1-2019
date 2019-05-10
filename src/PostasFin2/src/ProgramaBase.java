import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;
import lejos.hardware.Button;
public class ProgramaBase {
	String punto;
	String guion;
	int avanzar;
	int distancia;
	Robot bot;
	String codigo;
	
	public ProgramaBase(){
		punto = ".";
		guion = "-";
		avanzar = 30;
		distancia = 30;
		bot = new Robot(3);
		codigo = "";
		
	}
	public void recibirCodigoMorse(){
		

		SampleProvider sp = bot.sensorCodigo.getTouchMode();
		boolean botonActivado;
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
			
			if(botonActivado && !contando)
			{
				reloj.reset();
				contando = true;
			}
			if(!botonActivado && contando)
			{
				pushTime = reloj.elapsed();
				guardarCodigo(pushTime);
				System.out.println(pushTime);
				Delay.msDelay(1000);
				contando = false;
			}
			
			if (Button.readButtons() !=0)
			{
				
			System.out.println("apretaste un boton");
			Delay.msDelay(1000);
			
				
				
				
				
				
			}
			System.out.println(botonActivado);
			traducirCodigo();
			dibujarCodigo();
			
		}
	
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
	
	
	public void traducirCodigo()
	{
		
	}
	
	public void dibujarCodigo()
	{
		//for
		//operacion(simbolo);
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
