package paquetoton;

public class Libro extends Publicacion{
	
	  int ISBN;
	  int NumPagina;
	  
	 public Libro (int ISBN,String titulo,String autor,int año,int NumPagina) {
		super(titulo,autor,año);
		 this.ISBN = ISBN;
	     this.NumPagina = NumPagina;
	   
	 }

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getNumPagina() {
		return NumPagina;
	}

	public void setNumPagina(int numPagina) {
		NumPagina = numPagina;
	}
}