package paquetovich;
public class Ropa extends Producto{
	
	private String talla;
	private String color;
	 public Ropa (int codigoBarra,String nombre,int precio,String talla,String color) {
		 super(codigoBarra,nombre,precio);
		 this.talla = talla;
	     this.color = color;
	  
	     
	 }
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}