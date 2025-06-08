package supermercadooo;

public class Electronica extends Producto{
	
	  String marca;
	  String modelo;
	  
	 public Electronica (String nombre,int precio,String marca,String modelo) {
		super(nombre,precio);
		 this.marca = marca;
	     this.modelo = modelo;
	  
	     
	 }
}
