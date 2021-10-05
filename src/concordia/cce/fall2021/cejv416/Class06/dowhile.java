package concordia.cce.fall2021.cejv416.Class06;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word, enter Q to quit.:");

        String response;
        do {
            response = s.nextLine();
            if (!response.equalsIgnoreCase("q")) {
                System.out.println("You entered " + response);
            }
        } while (!response.toUpperCase().equals("Q"));


    }
}
