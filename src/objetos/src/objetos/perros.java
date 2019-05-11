package objetos;

public class perros {
  String nombre;
  String raza;
   perros(String n, String r){
	   nombre = n;
	   raza = r;
   }
   void ladrar (){
	   System.out.println("soy" + nombre);
	   System.out.println("de raza" + raza);
	   System.out.println("miau miau miau");
   }
}
