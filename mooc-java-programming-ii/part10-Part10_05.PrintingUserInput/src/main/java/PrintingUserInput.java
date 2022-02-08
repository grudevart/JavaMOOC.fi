
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        while(true) {
        	String input = scanner.nextLine();
        	if(input.isEmpty()) {
        		break;
        	}
        	inputs.add(input);
        }
        
        inputs.stream().forEach(inputString -> System.out.println(inputString));
        scanner.close();
    }
}
