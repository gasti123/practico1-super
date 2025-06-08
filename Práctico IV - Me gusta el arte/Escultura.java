package paqueto;

public class Escultura extends ObraArte{
	
	  String Material;
	  String Representacion;
	  
	 public Escultura(String nombre,String autor,int año,String Material,String Representacion) {
		super(nombre,autor,año);
		 this.Material = Material;
	     this.Representacion = Representacion;
	  
	     
	 }
}