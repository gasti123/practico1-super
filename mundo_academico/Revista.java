package mundo_academicoo;

public class Revista extends Publicacion{
	
	  int NumEdicion;
	  int periodicidad;
	  
	 public Revista(String titulo,String autor,int año,int NumEdicion,int periodicidad2) {
		super(titulo,autor,año);
		 this.NumEdicion = NumEdicion;
	     this.periodicidad = periodicidad2;
	  
	     
	 }
}