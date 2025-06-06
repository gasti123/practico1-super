package mundo_academicoo;

public class ArticuloCientifico extends Publicacion{
	
	  int NumCitacionesDadas;
	  
	 public ArticuloCientifico(String titulo,String autor,int año,int NumCitacionesDadas) {
		super(titulo,autor,año);
		 this.NumCitacionesDadas = NumCitacionesDadas;
	     
	  
	     
	 }
}