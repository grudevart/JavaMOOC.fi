
public class Main {

	public static void main(String[] args) {
		// Use this main program for testing your classes!
		Hold hold = new Hold(128);

		Suitcase suitcase1 = new Suitcase(10);
		suitcase1.addItem(new Item("Pig", 7));
		suitcase1.addItem(new Item("Wolf", 2));
		System.out.println(suitcase1.toString());
		hold.addSuitcase(suitcase1);

		Suitcase suitcase2 = new Suitcase(10);
		suitcase2.addItem(new Item("Chicken", 5));
		suitcase2.addItem(new Item("Fox", 3));

		hold.addSuitcase(suitcase2);

		Suitcase suitcase3 = new Suitcase(10);
		suitcase3.addItem(new Item("Cat", 5));
		suitcase3.addItem(new Item("Dog", 3));
		hold.addSuitcase(suitcase3);
		hold.printItems();
		System.out.println("noy ok");
	}

}
