package CCA.CONCORDIA.CEJV416.FALL2021.CLASS3;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        // Scanner? Scans (Observes) the input for data
        // Input = System.in

        //what is the first name, last name, and print a salutation

        Scanner myScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Please enter your first number");
        firstNumber =myScanner.nextInt();
        System.out.println("Now enter the second number");
        secondNumber =myScanner.nextInt();

        String answer = "The two numbers addded equal  " + (firstNumber + secondNumber);

        System.out.println(answer);
    }
}
