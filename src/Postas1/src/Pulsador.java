import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class Pulsador {

	EV3TouchSensor sensor;

	Pulsador(Port s) {
		sensor = new EV3TouchSensor(s);
	}

	boolean estaPresionado() {
        SampleProvider sp = sensor.getTouchMode();
	    float [] sample = new float[sp.sampleSize()];
        sp.fetchSample(sample, 0);
        float valorObtenido = sample[0];
        return valorObtenido == 0;
	}
}
