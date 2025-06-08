package paqueto;

public class ObraArte {
	 private String nombre;
	 private String autor;
	 private int año;
	 
	 public ObraArte (String nombre,String autor,int año) {
		 this.nombre = nombre;
		 this.autor  = autor ;
		 this.año  = año ;
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	 
}