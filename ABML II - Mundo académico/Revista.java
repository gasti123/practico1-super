package paquetoton;

public class Revista extends Publicacion{
	
	  int NumEdicion;
	  int ISSN;
	  
	 public Revista( int ISSN,String titulo,String autor,int año,int NumEdicion) {
		super(titulo,autor,año);
		 this.NumEdicion = NumEdicion;
	     this.ISSN = ISSN;
	     
	 }

	public int getNumEdicion() {
		return NumEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		NumEdicion = numEdicion;
	}

	public int getISSN() {
		return ISSN;
	}

	public void setISSN(int ISSN) {
		this.ISSN = ISSN;
	}
}