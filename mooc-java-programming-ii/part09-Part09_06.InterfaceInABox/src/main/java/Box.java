import java.util.ArrayList;

public class Box implements Packable {

	private double maxCapacity;
	private ArrayList<Packable> itemsInBox;
	
	public Box(double capacity) {
		this.maxCapacity = capacity;
		this.itemsInBox = new ArrayList<Packable>();
	}
	
	public double weight() {
		double weight = 0;
		
		for(Packable item : itemsInBox) {
			weight += item.weight();
		} 
		return weight;
		
	}
	
	public void add(Packable packable) {
		if(this.weight()+packable.weight() > maxCapacity) {
			return;
		}	
		itemsInBox.add(packable);
	}
	
	public String toString() {
		return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() +" kg";
	}

}
