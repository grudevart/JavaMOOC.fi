import java.util.ArrayList;

public class MisplacingBox extends Box {

	private ArrayList<Item> magicBox;

	public MisplacingBox() {
		this.magicBox = new ArrayList<Item>();
	}

	@Override
	public void add(Item item) {
		this.magicBox.add(item);

	}

	@Override
	public boolean isInBox(Item item) {
		return false;
	}

}
