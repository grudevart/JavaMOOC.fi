import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Herd implements Movable {

	private List<Movable> organismHerd;

	public Herd() {
		this.organismHerd = new ArrayList<>();
	}

	public void addToHerd(Movable movable) {
		this.organismHerd.add(movable);
	}
	
	@Override
	public String toString() {
		String toPrint = "";
		for(Movable organism : organismHerd) {
			toPrint = toPrint + organism.toString() + '\n';
		}
		return toPrint;
	}

	@Override
	public void move(int dx, int dy) {
		for (Movable organism : organismHerd) {
			organism.move(dx, dy);
		}

	}

}
