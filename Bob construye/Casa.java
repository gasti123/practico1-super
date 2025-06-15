package paquete;

public class Casa extends Edificio{
	
	  String Material;
	  int CantHabit;
	  
	 public Casa (int Tamaño,int CosteConstruccion,String Material,int CantHabit) {
		super(Tamaño,CosteConstruccion);
		 this.Material = Material;
	     this.CantHabit = CantHabit;
	  
	     
	 }
}