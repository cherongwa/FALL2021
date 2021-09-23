package CCA.CONCORDIA.CEJV416.FALL2021.CLASS4;

import java.text.NumberFormat;
import java.util.Scanner;

public class sales {

    public static void main(String[] args) {

        Scanner sell = new Scanner(System.in);

        System.out.println("What is the price of the item in double?");
        double price = sell.nextDouble();

        System.out.println("How many items did you purchase?");
        int quantity = sell.nextInt();

        double total = price * quantity;
        double quebec = (9.975/100)*total;
        double gst = ((double)5/100)*total;
        double finaltotal = total + quebec + gst;



        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        String formatedSalary = priceFormat.format(finaltotal);
        System.out.println(formatedSalary);

    }
}
