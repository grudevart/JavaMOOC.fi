
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();

		while (true) {
			System.out.println("Input numbers, type \"end\" to stop");
			String input = scan.nextLine();
			if (input.equals("end")) {
				break;
			}
			inputs.add(input);
		}
		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
		String inputChoice = scan.nextLine();
		if (inputChoice.equals("n")) {
			double negativeAverage = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0)
					.average().orElse(0.0);
			System.out.println(negativeAverage);
		} else if (inputChoice.equals("p")) {
			double positiveAverage = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0)
					.average().orElse(0.0);
			System.out.println(positiveAverage);
		}
		scan.close();
	}
}
