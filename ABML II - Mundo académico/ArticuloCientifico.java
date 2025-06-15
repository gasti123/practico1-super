package paquetoton;

public class ArticuloCientifico extends Publicacion{
	
	  int NumCitacionesDadas;
	  int DOI;
	 public ArticuloCientifico(int DOI,String titulo,String autor,int año,int NumCitacionesDadas) {
		super(titulo,autor,año);
		 this.NumCitacionesDadas = NumCitacionesDadas;
		 this.DOI = DOI;
	  
	     
	 }

	public int getNumCitacionesDadas() {
		return NumCitacionesDadas;
	}

	public void setNumCitacionesDadas(int numCitacionesDadas) {
		NumCitacionesDadas = numCitacionesDadas;
	}

	public int getDOI() {
		return DOI;
	}

	public void setDOI(int dOI) {
		DOI = dOI;
	}
}