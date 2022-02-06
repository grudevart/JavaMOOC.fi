
public class Book implements Packable {
	
	private String author;
	private String bookName;
	private double weight;
	
	public Book(String author, String name, double weight) {
		this.author = author;
		this.bookName = name;
		this.weight = weight;
	}
	
	public String toString() {
		return this.author+ ": " + this.bookName;
	}

	@Override
	public double weight() {
		return this.weight;
	}

}
