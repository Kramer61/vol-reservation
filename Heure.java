public class Heure {

	private int time;

	public Heure( int time ) {
		this.time = time;
	}

	@Override
	public String toString(){
		if ( this.time < 60 ) {
			return String.format("00h%s",this.time);
		} 
		else if ( this.time < 1440 ) {
			return String.format("%sh%s ",this.time/60, Math.round((this.time/60.0- this.time/60)*60));
		} else {
			throw new IllegalArgumentException("Time not valide");
		}
	}



}
