
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

	public static void main(String[] args) {
		List<String> rows = new ArrayList<>();
		try {
			Files.lines(Paths.get("literacy.csv")).forEach(row -> rows.add(row));
			;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		rows.stream().map(row -> row.split(",")).sorted((p1, p2) -> p1[5].compareTo(p2[5])).forEach(
				p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].replace("(%)", "").trim() + ", " + p[5]));
	}
}