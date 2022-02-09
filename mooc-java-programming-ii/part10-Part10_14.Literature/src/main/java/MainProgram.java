
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Input the name of the book, empty stops: ");
			String bookName = "NaN";
			if (scanner.hasNextLine()) {
				bookName = scanner.nextLine();
			}
			if (bookName.isEmpty()) {
				break;
			}
			System.out.print("Input the age recommendation: ");
			int ageRecommendation = 0;
			if (scanner.hasNextLine()) {
				ageRecommendation = Integer.valueOf(scanner.nextLine());
			}
			books.add(new Book(bookName, ageRecommendation));
			System.out.println("");
		}
		System.out.println(books.size() + " books in total.");
		Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommmendation).thenComparing(Book::getName);
		//Collections.sort(books, comparator);
		System.out.println("Books:");
		books.stream().sorted(comparator).forEach(book -> System.out.println(book));
		scanner.close();
	}

}
