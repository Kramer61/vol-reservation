
public class Vol {

    private int numero;

    private Datetime dateDepart;
    private Datetime dateArrivee;

    private Datetime duree; 

	    
    public Vol( int numero, Datetime dateDepart, Datetime dateArrivee){
		this.numero = numero;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
    }

    public void ouvrir(){
    }

    public void fermer(){
    }


	@Override
	public String toString(){
		return String.format("/n%s %s %s/n", this.numero, this.dateDepart, this.dateArrivee);
	}
}
