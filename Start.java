import java.util.Date;
public class Start {

    public static void main( String args[] ) {
        Aeroport test = new Aeroport("test");

		Heure depart = new Heure(1000); // 16h40
		Heure arrivee = new Heure(1439); // 23h59

		Jour date = new Jour("20/10/2020");
		Jour date2 = new Jour("20/10/2020");

		Datetime p = new Datetime(depart, date);
		Datetime pp = new Datetime(arrivee, date2);

		Compagnie airfrance = new Compagnie("Airfrance");
		for (int i = 1 ; i < 5 ; i++ ) {
       		airfrance.creerVol(i,p,pp);
		}

        System.out.println( airfrance.toString() );
		
    
    }

}
