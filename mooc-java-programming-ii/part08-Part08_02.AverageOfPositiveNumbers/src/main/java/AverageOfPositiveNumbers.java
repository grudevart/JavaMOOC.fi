
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
        	System.out.print("");
        	int input = Integer.valueOf(scanner.nextLine());
        	if(input<0) {
        		continue;
        	} else if (input == 0) {
        		break;
        	} else {
        		sum += input;
        		count++;
        	}
        }
        double average = 1.0*sum/count;
        if(sum == 0) {
        	System.out.println("Cannot calculate the average");
        	return;
        } else if(average == 0.0 || average == 0) {
        	System.out.println("Cannot calculate the average");
        } else {
        	System.out.println(average);
        }

    }
}
