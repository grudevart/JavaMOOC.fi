
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
        	String input = scan.nextLine();
        	if(input.equals("end")) {
        		break;
        	}
        	inputs.add(input);
        	
        }
        
        double average = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();
        
       System.out.println("Average of the numbers: " + average);

    }
}
