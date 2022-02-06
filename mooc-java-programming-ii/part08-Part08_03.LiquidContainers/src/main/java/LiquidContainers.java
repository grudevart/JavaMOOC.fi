
import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = 0, second = 0;
		String firstContainer = "First: ", secondContainer = "Second: ";
		System.out.print(firstContainer + first + "/100" + '\n' + secondContainer + second + "/100" + '\n');
		while (true) {
			System.out.print("");

			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}

			if (input.startsWith("add")) {
				String[] toSplit = input.split(" ");
				int amountToAdd = Math.abs(Integer.valueOf((toSplit[1])));

				if (first + amountToAdd > 100) {
					first = 100;
				} else {
					first += amountToAdd;
				}
				System.out.print(firstContainer + first + "/100" + '\n' + secondContainer + second + "/100" + '\n');
			}

			if (input.startsWith("move")) {
				String[] toSplit = input.split(" ");
				int amountToMove = Math.abs(Integer.valueOf((toSplit[1])));

				if (first == 0) {
					return;
				}
				
				else if (first < amountToMove) {
					second = first;
					first = 0;
				}

				else if (second + amountToMove > 100) {
					second = 100;
					first -= amountToMove;
					if (first < 0) {
						first = 0;
					}
				} else {
					first -= amountToMove;
					if (first < 0) {
						first = 0;
					}
					second += amountToMove;
				}
				System.out.print(firstContainer + first + "/100" + '\n' + secondContainer + second + "/100" + '\n');

			}
			if (input.startsWith("remove")) {
				String[] toSplit = input.split(" ");
				int amountToRemove = Math.abs(Integer.valueOf((toSplit[1])));
				
				second -=amountToRemove;
				if(second<0) {
					second = 0;
				}
				
				
				System.out.print(firstContainer + first + "/100" + '\n' + secondContainer + second + "/100" + '\n');
			}
		}
	}
}

