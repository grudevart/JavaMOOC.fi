
public class Person {
	
	private String name;
	private Education education;
	
	public Person(String name, Education education) {
		this.education = education;
		this.name = name;
	}
	
	public Education getEducation() {
		return this.education;	}
	
	public String toString() {
		return this.name + ", "+ this.education;
	}

}
