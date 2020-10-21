public class Jour {

	private String date;

	//TODO : Regex de validation de date

	public Jour( String date ) {
		this.date = date;
	}

	@Override
	public String toString(){
		return this.date;
	}

}
