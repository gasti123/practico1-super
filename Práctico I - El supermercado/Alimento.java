package supermercadooo;

public class Alimento extends Producto {
	  String fechaVencimiento;
	 public Alimento (String nombre,int precio,String fechaVencimiento) {
		super(nombre,precio);
		 this.fechaVencimiento = fechaVencimiento;
	
	     
	 }
}