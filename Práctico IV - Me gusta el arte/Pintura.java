package paqueto;

public class Pintura extends ObraArte{
	
	  String Tamaño;
	  String Estilo;
	  
	 public Pintura (String nombre,String autor,int año,String Tamaño,String Estilo) {
		super(nombre,autor,año);
		 this.Tamaño = Tamaño;
	     this.Estilo = Estilo;
	  
	     
	 }
}