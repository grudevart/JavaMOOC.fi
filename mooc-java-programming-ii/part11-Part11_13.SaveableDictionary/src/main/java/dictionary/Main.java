package dictionary;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	SaveableDictionary dictionary = new SaveableDictionary("words.txt");
    	dictionary.load();

    	boolean wasSuccessful = dictionary.load();

    	if (wasSuccessful) {
    	    System.out.println("Successfully loaded the dictionary from file");
    	}
      	System.out.println(dictionary.translate("apina"));
      	System.out.println(dictionary.translate("ohjelmointi"));
      	System.out.println(dictionary.translate("alla oleva"));
      	dictionary.add("artur", "madzia");
      	dictionary.save();

    }
    
}
