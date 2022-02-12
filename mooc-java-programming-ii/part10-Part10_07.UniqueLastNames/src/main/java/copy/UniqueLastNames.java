
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continueQ = "quit";

        do {
            System.out.println("Continue personal information input? \"quit\" ends:");
            if(scanner.hasNextLine()){continueQ = scanner.nextLine();}
            System.out.print("Input first name: ");
            String firstName = "NaN";
            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        } while(!continueQ.equals("quit"));
        // Implement the printing of the unique last names in alphabetical order here:
        System.out.println("Unique last names in alphabetical order: ");
        persons.stream().map(person -> person.getLastName()).distinct().sorted().forEach(lastName -> System.out.println(lastName));
    }
}
