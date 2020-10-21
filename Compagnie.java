import java.util.ArrayList;

public class Compagnie {

    private String nom;
	private ArrayList<Vol> listVol = new ArrayList<Vol>();


    public Compagnie( String str ) {
        this.nom = str;
    }

	public void creerVol( int numero, Datetime dateDepart, Datetime dateArrivee){
		this.listVol.add(new Vol( numero, dateDepart, dateArrivee));
	}

	@Override
	public String toString(){
		return this.nom + ", " + this.listVol.toString();
	}

}
