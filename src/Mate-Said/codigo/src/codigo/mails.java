package codigo;

import lejos.hardware.port.SensorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import lejos.robotics.ColorDetector;
import lejos.robotics.ColorIdentifier;

public class mails {
	public abstract class ColorSensor implements ColorDetector, ColorIdentifier
	{
		EV3ColorSensor	sensor;
		float[]		sample;

	public ColorSensor(Port S4)
	{
		sensor = new EV3ColorSensor(S4);
		setAmbientMode();
		setFloodLight(false);
	}

	public EV3ColorSensor getSensor()
	{
		return sensor;
	}
	
	public void setAmbientMode()
	{
		sensor.setCurrentMode("Ambient");
		sample = new float[sensor.sampleSize()];
	}
	
	public void setRedMode()
	{
		sensor.setCurrentMode("Red");
		sample = new float[sensor.sampleSize()];
	}
	
	public void setColorIdMode()
	{
		sensor.setCurrentMode("ColorID");
		sample = new float[sensor.sampleSize()];
	}
	
	public void setRGBMode()
	{
		sensor.setCurrentMode("RGB");
		sample = new float[sensor.sampleSize()];
	}

	public int getColorID()
	{
		sensor.fetchSample(sample, 0);
		
		return (int) sample[0];
	}

	
	public Color getColor()
	{
		sensor.fetchSample(sample, 0);
		
		return new Color((int)(sample[0] * 255), (int)(sample[1] * 255), (int)(sample[2] * 255));
	}

	public float getAmbient()
	{
		sensor.fetchSample(sample, 0);
		
		return sample[0];
	}

	public float getRed()
	{
		sensor.fetchSample(sample, 0);
		
		return sample[0];
	}
	

	public void close()
	{
		sensor.close();
	}

	public boolean isFloodLightOn()
	{
		return sensor.isFloodlightOn();
	}

	
	public void setFloodLight(boolean on)
	{
		sensor.setFloodlight(on);
	}
	
	
	public void setFloodLight(int color)
	{
		sensor.setFloodlight(color);
	}
	
	
	public String colorName(int color)
	{
		switch (color)
		{
			case Color.NONE:
				return "None";
				
			case Color.BLACK:
				return "Black";
				
			case Color.BLUE:
				return "Blue";
				
			case Color.BROWN:
				return "Brown";
				
			case Color.CYAN:
				return "Cyan";
				
			case Color.DARK_GRAY:
				return "Dark Gray";
				
			case Color.GRAY:
				return "Gray";
				
			case Color.GREEN:
				return "Green";
				
			case Color.LIGHT_GRAY:
				return "Light Gray";
				
			case Color.MAGENTA:
				return "Magenta";
				
			case Color.ORANGE:
				return "Orange";
				
			case Color.PINK:
				return "Pink";
				
			case Color.RED:
				return "Red";
				
			case Color.WHITE:
				return "White";
				
			case Color.YELLOW:
				return "Yellow";
		}
		
		return "";
  }
 }
}
