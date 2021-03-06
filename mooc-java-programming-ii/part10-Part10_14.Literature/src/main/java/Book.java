
public class Book {
	
	private String name;
	private int ageRecommmendation;
	
	public Book(String name, int ageRecommendation) {
		this.name = name;
		this.ageRecommmendation = ageRecommendation;
	}

	public String getName() {
		return name;
	}

	public int getAgeRecommmendation() {
		return ageRecommmendation;
	}

	public String toString() {
		return this.getName() +" (recommended for " + this.getAgeRecommmendation() + " year-olds or older)";
	}
}
