package concordia.cce.fall2021.cejv416.class03;

import java.text.NumberFormat;
import java.util.Scanner;

public class sales2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberFormat nf;
        double totalPrice;
        double subTotal;
        double itemPrice;
        int itemQuantity;
        String formattedPrice;

        System.out.println("What is the price of the item? (double)");
        itemPrice =sc.nextDouble();

        System.out.println("How many items were purchased? (int)");
        itemQuantity = sc.nextInt();

        subTotal = itemPrice*itemQuantity;

        totalPrice = subTotal + (subTotal*0.05) + (subTotal*0.09975);

        formattedPrice = NumberFormat.getCurrencyInstance().format(totalPrice);
        System.out.println("Thank you, the total price is " + formattedPrice);





    }
}
