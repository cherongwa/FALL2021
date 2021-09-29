package concordia.cce.fall2021.cejv416.class03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner? Scans (Observes) the input for data
        // Input = System.in

        //what is the first name, last name, and print a salutation

        Scanner myScanner = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.println("Please enter your first name.");
        firstName =myScanner.nextLine();
        System.out.println("Now enter your last name");
        lastName =myScanner.nextLine();

        System.out.println("Hello  " +firstName + " " + lastName);
    }
}
