
public class ProductWarehouseWithHistory extends ProductWarehouse {

	private ChangeHistory inventory;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		this.inventory = new ChangeHistory();
		super.addToWarehouse(initialBalance);
		inventory.add(initialBalance);
	}

	public String history() {
		return this.inventory.toString();
	}

	public void printAnalysis() {
		System.out.println("Product: " + super.getName() + '\n' + "History: " + history() + '\n'
				+ "Largest amount of product: " + inventory.maxValue() + '\n' + "Smallest amount of product: "
				+ inventory.minValue() + '\n' + "Average: " + inventory.average());
	}

	@Override
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		inventory.add(super.getBalance());
	}

	@Override
	public double takeFromWarehouse(double amount) {
		Double amountToReturn = super.takeFromWarehouse(amount);
		inventory.add(super.getBalance());
		return amountToReturn;
	}

}
