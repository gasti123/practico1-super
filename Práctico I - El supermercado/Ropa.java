package supermercadooo;

public class Ropa extends Producto{
	
	  String talla;
	  String color;
	 public Ropa (String nombre,int precio,String talla,String color) {
		super(nombre,precio);
		 this.talla = talla;
	     this.color = color;
	  
	     
	 }
}