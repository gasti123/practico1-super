package paquete;

public class Apartamento extends Edificio{
	
	  int NumPisos;
	  int CostoMantenimiento;
	 public Apartamento (int CodigoPostal,int CosteConstruccion,int Tamaño,int NumPisos,int CostoMantenimiento) {
		super(CodigoPostal,CosteConstruccion,Tamaño);
		 this.NumPisos = NumPisos;
	     this.CostoMantenimiento = CostoMantenimiento;
	  
	     
	 }
	public int getNumPisos() {
		return NumPisos;
	}
	public void setNumPisos(int numPisos) {
		NumPisos = numPisos;
	}
	public int getCostoMantenimiento() {
		return CostoMantenimiento;
	}
	public void setCostoMantenimiento(int costoMantenimiento) {
		CostoMantenimiento = costoMantenimiento;
	}
}