import java.util.HashMap;

public class Abbreviations {
	
	private HashMap<String, String> shorts;
	
	public Abbreviations() {
		this.shorts = new HashMap<String, String>();
	}

	public void addAbbreviation(String abberviation, String explanation) {
		if(this.shorts.containsKey(abberviation)) {
			System.out.println("Wrong!");
		} else {
		this.shorts.put(abberviation, explanation);
		}
	}

	public boolean hasAbbreviation(String abberviation) {
		if(this.shorts.containsKey(abberviation)) {
			return true;
		}else {
		return false;
		}
	}

	public String findExplanationFor(String abberviation) {
		if(this.shorts.containsKey(abberviation)) {
			return this.shorts.get(abberviation);
		} else {
		return null;
	}
	}
}