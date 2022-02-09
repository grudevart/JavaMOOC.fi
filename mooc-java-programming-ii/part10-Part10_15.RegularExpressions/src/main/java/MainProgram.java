import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
    	List<String> test = new ArrayList<>();
    	test.add("tue");
    	test.add("io");
    	test.add("queue");
    	test.add("11:25:00");
    	Checker regex = new Checker();
    	for(String string : test) {
    	if(regex.allVowels(string)) {
    		System.out.println("ok");
    	} else {
    		System.out.println("no ok");
    	}
    	}
    	
    }
}
