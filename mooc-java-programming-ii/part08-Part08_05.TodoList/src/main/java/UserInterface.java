import java.util.Scanner;

public class UserInterface {

	private TodoList list;
	private Scanner scanner;

	public UserInterface(TodoList list, Scanner scanner) {
		this.list = list;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.print("Command:");
			String input = scanner.nextLine();
			if (input.equals("stop")) {
				break;
			} else if (input.equals("list")) {
				list.print();
			} else if (input.equals("add")) {
				System.out.println("To add: ");
				String taksToAdd = scanner.nextLine();
				list.add(taksToAdd);
			} else if (input.equals("remove")) {
				System.out.println("Wich one is removed?");
				int completed = Integer.valueOf(scanner.nextLine());
				list.remove(completed);
			}
		}
	}

}
