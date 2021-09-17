package CCA.CONCORDIA.CEJV416.FALL2021.CLASS2;

import java.math.BigDecimal;

public class VariablePractice {
   /* this is some
            aijeija*/

    public static void main(String[] args) {
        double GASuSAGE =1.1;
        float waterUsage = 1.2f;

        int counter;
        counter =0;

        int counter2 =0;

        boolean expired = true;

        char my_initial = 'B';
        // char is a type
        //string is a reference ( a class)

        int a = 1;
        int b = 2;
        int c = a+b;

        double d = a/b;
        double e = 5.0/2;
        double f = (double)5 / 2;


        //sale is a class
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int x = 4;
        long y = 22;

        int z = x + (int)y;

        System.out.println(z);

        double p = Math.pow(2.0,2.0);

        System.out.println(p);

        double radius = 5.0;
        double circleArea = Math.PI* (radius * radius);

        double circleArea2 = Math.pow(Math.PI * radius, 2.0);

        BigDecimal costOfMeal = new BigDecimal (  "22.99");

        System.out.println(costOfMeal);
        costOfMeal = costOfMeal.add(new BigDecimal("1.0"));

    }
}

