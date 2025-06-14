package paquetovich;

public class Producto {

	private int codigoBarra;
	private String nombre;
	private int precio;

	public Producto(int codigoBarra, String nombre, int precio) {
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(int codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}