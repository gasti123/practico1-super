package paquete;

public class Edificio {
	 private int CodigoPostal;
	 private int CosteConstruccion;
	 private int Tamaño;

	public Edificio(int CodigoPostal,int CosteConstruccion, int Tamaño) {
		this.CodigoPostal = CodigoPostal;
		this.CosteConstruccion = CosteConstruccion;
		this.Tamaño = Tamaño;
		
	}

	public int getCodigoPostal() {
		return CodigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		CodigoPostal = codigoPostal;
	}

	public int getCosteConstruccion() {
		return CosteConstruccion;
	}

	public void setCosteConstruccion(int costeConstruccion) {
		CosteConstruccion = costeConstruccion;
	}

	public int getTamaño() {
		return Tamaño;
	}

	public void setTamaño(int tamaño) {
		Tamaño = tamaño;
	}

	
}