
import java.util.ArrayList;

public class Aeroport {

    private String nom;

    public ArrayList villes = new ArrayList();

    public Aeroport( String str ) {
        this.nom = str;
    }

    public String getNomAeroport() {
      return this.nom;
	}
   
	public void setNomAeroport(String name){
		this.nom = name;
	}
	
	public ArrayList getCity(){
		return villes;
	}
	
	public void setCity(ArrayList city){
		this.villes = city;
	}
	
	@Override
	public String toString(){
		return this.nom;
	}

}
