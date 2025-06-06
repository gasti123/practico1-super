package mundo_academicoo;

public class Libro extends Publicacion{
	
	  int ISBN;
	  int NumPagina;
	  
	 public Libro (String titulo,String autor,int año,int ISBN,int NumPagina) {
		super(titulo,autor,año);
		 this.ISBN = ISBN;
	     this.NumPagina = NumPagina;
	  
	     
	 }
}