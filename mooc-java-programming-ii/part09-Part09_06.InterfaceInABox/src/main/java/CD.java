
public class CD implements Packable {

	private String artist;
	private String cdName;
	private int publicationYear;
	private double weight;

	public CD(String artist, String cdName, int publicationYear) {
		this.artist = artist;
		this.cdName = cdName;
		this.publicationYear = publicationYear;
	}

	public String toString() {
		return this.artist + ": " + this.cdName + " (" + this.publicationYear + ")";
	}

	@Override
	public double weight() {
		return 0.1;
	}

}
