
public class Circulo {
	int radio;
	
	Circulo(int r){
		radio=r;
	}
    double perimetro( ){
        double p=2*Math.PI*radio;
        return p;
    }
    double area(){
    	double a=Math.PI*radio*radio;
    	return a;
    }
}
