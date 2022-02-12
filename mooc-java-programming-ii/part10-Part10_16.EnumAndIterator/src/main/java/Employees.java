import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

	private ArrayList<Person> persons;

	public Employees() {
		this.persons = new ArrayList<Person>();
	}

	public void add(Person personToAdd) {
		persons.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		persons.addAll(peopleToAdd);
	}

	public void fire(Education education) {
		Iterator<Person> iterator = persons.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}

	}

	public void print() {
		Iterator<Person> iterator = persons.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void print(Education education) {
		Iterator<Person> iterator = persons.iterator();

		while (iterator.hasNext()) {
			Person toPrint = iterator.next();
			if (toPrint.getEducation() == education) {
				System.out.println(toPrint);
			}
		}
	}

}
