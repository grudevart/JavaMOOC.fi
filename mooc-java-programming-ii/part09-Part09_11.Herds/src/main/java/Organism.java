
public class Organism implements Movable {

	private int positionX;
	private int positionY;

	public Organism(int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}

	@Override
	public String toString() {
		return "x: " + this.positionX + "; y: " + this.positionY;
	}

	@Override
	public void move(int dx, int dy) {
		this.positionX = this.positionX + dx;
		this.positionY = this.positionY + dy;
	}

}
