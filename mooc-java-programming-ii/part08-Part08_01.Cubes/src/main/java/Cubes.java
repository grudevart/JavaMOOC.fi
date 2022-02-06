
import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = 0;
        int cube = 0;
        while(true) {
        	System.out.print("");
        	String input = scanner.nextLine();
        	if(input.equals("end")) {
        		break;
        	} else {
        		inputInt = Integer.valueOf(input);
        		cube = (inputInt*inputInt*inputInt);
        		System.out.println(cube);
        	}
        } 
        }
    }

