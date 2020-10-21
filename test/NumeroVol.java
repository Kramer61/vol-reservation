
public class NumeroVol {

	private String valeur;

	private String validate( String valeur ) {
		//TODO;
		return this.valeur;
	}

	public boolean isValidVol( String valeur ) {
		//TODO
		return false;
	}

	public String toString() {
		return this.valeur;
	}

	public NumeroVol() {
		this.valeur = NumeroFactory.numFactory();
	}
}
