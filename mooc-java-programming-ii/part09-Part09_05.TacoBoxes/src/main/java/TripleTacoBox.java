
public class TripleTacoBox implements TacoBox {

	private int taco;

	public TripleTacoBox() {
		this.taco = 3;
	}

	@Override
	public int tacosRemaining() {
		return this.taco;
	}

	@Override
	public void eat() {
		if (this.taco - 1 < 0) {
			return;
		}
		this.taco--;

	}

}
