package concordia.cce.fall2021.cejv416.class05;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Please, enter a number");
        int answer = num.nextInt();

        if (answer%5 == 0) {
            System.out.println("hifive");

        }
        if (answer %2 == 0) {
            System.out.println("Hi even");
        }
    }
}
