package paquetovich;

public class Alimento extends Producto {
	  String fechaVencimiento;
	  int Kg;
	  public Alimento (int codigoBarra,String nombre,int precio,String fechaVencimiento,int Kg) {
			 super(codigoBarra,nombre,precio);
		 this.fechaVencimiento = fechaVencimiento;
		 this.Kg = Kg;
	     
	 }
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getKg() {
		return Kg;
	}
	public void setKg(int kg) {
		Kg = kg;
	}
}