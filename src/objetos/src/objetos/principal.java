package objetos;


public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*  perros peluche= new perros("peluche","pekines");
       peluche.ladrar();
       perros coki = new perros("coki","chapi");
       coki.ladrar();
      //consola xbox = new consola(100000);
       //int GB =xbox.calcularAlmacenamientoGB();
       //System.out.println(GB);
       */
		int x = 4;
		contador c = new contador();
		int a = c.aumentador();
		System.out.println(a);
		int b = c.aumentador();
		System.out.println(b);
		int v = c.decrementar();
		System.out.println(v);
	}

}
