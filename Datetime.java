
import java.util.Date;

public class Datetime {

    private Heure time;
	private Jour date;


	public Datetime( Heure time, Jour date ) {
		this.time = time;
		this.date = date;
	}

	@Override
	public String toString(){
		return this.time.toString() + this.date.toString();
	}

}
