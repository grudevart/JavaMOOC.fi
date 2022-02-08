
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        
        while(true) {
        	int input = Integer.valueOf(scanner.nextLine());
        	if(input<0) {
        		break;
        	}
        	inputs.add(input);
        }
        
        inputs.stream().filter(number -> number>0 && number<6).forEach(number -> System.out.println(number));

    }
}
