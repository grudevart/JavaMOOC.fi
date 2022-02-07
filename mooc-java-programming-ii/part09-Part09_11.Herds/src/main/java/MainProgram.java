

public class MainProgram {

    public static void main(String[] args) {
    	Organism mamal = new Organism(0, 0);
    	System.out.println(mamal);
    	mamal.move(10, 15);
    	System.out.println(mamal);
    	Herd herd = new Herd();
    	herd.addToHerd(new Organism(57, 66));
    	herd.addToHerd(new Organism(73, 56));
    	herd.addToHerd(new Organism(46, 52));
    	herd.addToHerd(new Organism(19, 107));
    	System.out.println(herd);
    }
}
  