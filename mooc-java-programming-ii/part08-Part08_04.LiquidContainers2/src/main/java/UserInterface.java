import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	private Container container1;
	private Container container2;
	private Scanner scan;

	public UserInterface(Scanner scan) {
		this.container1 = new Container();
		this.container2 = new Container();
		this.scan = scan;
	}

	public void start() {
		System.out.println("First: " + container1);
		System.out.println("Second: " + container2);
		readCommands();
	}

	private void readCommands() {
		while (true) {
			System.out.print(">");
			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			} else if (input.startsWith("add")) {
				String[] toSplit = input.split(" ");
				int amountToAdd = Math.abs(Integer.valueOf((toSplit[1])));
				container1.add(amountToAdd);
			} else if (input.startsWith("move")) {
				String[] toSplit = input.split(" ");
				int amountToMove = Math.abs(Integer.valueOf((toSplit[1])));
				if(amountToMove>container1.contains()) {
					container2.add(container1.contains());
					container1.setAmount(0);
				} else {
					container1.setAmount(container1.contains() - amountToMove);
					container2.add(amountToMove);
				}
				
			} else if (input.startsWith("remove")) {
				String[] toSplit = input.split(" ");
				int amountToRemove = Math.abs(Integer.valueOf((toSplit[1])));
				container2.remove(amountToRemove);
			}
			System.out.println("First: " + container1);
			System.out.println("Second: " + container2);
		}
	}

}
