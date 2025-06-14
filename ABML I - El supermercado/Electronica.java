package paquetovich;
public class Electronica extends Producto{
	
	 private String marca;
	 private String modelo;
	  
	 public Electronica (int codigoBarra,String nombre,int precio,String marca,String modelo) {
		super(codigoBarra,nombre,precio);
		 this.marca = marca;
	     this.modelo = modelo;
	  
	     
	 }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
