package FlightControl;

import java.awt.TextArea;
import java.util.Scanner;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl fC = new FlightControl();
        TextUI ui = new TextUI(fC, scanner);
        ui.start();
        
    }
}
