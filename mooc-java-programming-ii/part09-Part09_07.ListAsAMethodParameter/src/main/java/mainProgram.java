import java.util.ArrayList;
import java.util.List;

public class mainProgram {

	public static void main(String[] args) {
		// test your method here
		List<String> names = new ArrayList<>();
		names.add("First");
		names.add("Senocd");
		names.add("Third");

		System.out.println(returnSize(names));

	}

	private static int returnSize(List names) {
		return names.size();
	}
}
