package paquete;

public class Casa extends Edificio{
	
	private String Material;
	private int CantHabit;
	  
	 public Casa (int CodigoPostal,int CosteConstruccion,int Tamaño,String Material,int CantHabit) {
		super(CodigoPostal,CosteConstruccion,Tamaño);
		 this.Material = Material;
	     this.CantHabit = CantHabit;
	  
	     
	 }

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public int getCantHabit() {
		return CantHabit;
	}

	public void setCantHabit(int cantHabit) {
		CantHabit = cantHabit;
	}
}