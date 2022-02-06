import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
	
	private HashMap<String, ArrayList<String>> manyTranslations;
	
	public DictionaryOfManyTranslations() {
		this.manyTranslations = new HashMap<String, ArrayList<String>>();
	}
	
	public void add(String word, String translation) {
		this.manyTranslations.putIfAbsent(word, new ArrayList<String>());
		this.manyTranslations.get(word).add(translation);
		
	}
	
	public ArrayList<String> translate(String word){
		return this.manyTranslations.getOrDefault(word, new ArrayList<String>());	
	}
	
	public void remove(String word) {
		this.manyTranslations.remove(word);		
	}

}
