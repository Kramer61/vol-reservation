

public class Vol implements Voyage {
	private String destination;
	private String depart;
	private NumeroVol numVol;

	public Vol(){
		this.numVol = new NumeroVol();
	}

	public String getDepart(){
		return this.depart;
	}

	public String getDestination(){
		return this.destination;
	}

	public void setDepart( String depart ) {
		this.depart = depart;
	}

	public void setDestination( String destination ) {
		this.destination = destination;
	}

	public String toString() {
		return String.format("%s",this.numVol);
	}

}
