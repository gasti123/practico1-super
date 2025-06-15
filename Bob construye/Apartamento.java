package paquete;

public class Apartamento extends Edificio{
	
	  int NumPisos;
	  int CostoMantenimiento;
	 public Apartamento (int Tamaño,int CosteConstruccion,int NumPisos,int CostoMantenimiento) {
		super(Tamaño,CostoMantenimiento);
		 this.NumPisos = NumPisos;
	     this.CostoMantenimiento = CostoMantenimiento;
	  
	     
	 }
}