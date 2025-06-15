package paquete;

public abstract class Edificio {
	 private int Tamaño;
	 private int CosteConstruccion;
	 
	 public Edificio (int Tamaño,int CosteConstruccion) {
		 this.Tamaño = Tamaño;
		 this.CosteConstruccion = CosteConstruccion;
		 
	 }
	 public int getTamaño() {
			return Tamaño;
		}

		public void setTamaño(int Tamaño) {
			this.Tamaño = Tamaño;
		}
	public int getCosteConstruccion() {
		return CosteConstruccion;
	}

	public void setCosteConstruccion(int CosteConstruccion) {
		this.CosteConstruccion = CosteConstruccion;
	}


	}
