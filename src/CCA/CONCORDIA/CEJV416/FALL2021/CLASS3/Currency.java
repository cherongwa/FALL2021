package CCA.CONCORDIA.CEJV416.FALL2021.CLASS3;

import java.text.NumberFormat;

public class Currency {
    public static void main(String[] args) {

        //currency
        double salary = 2310.11;
        NumberFormat n = NumberFormat.getCurrencyInstance();
        String formatedSalary = n.format(salary);
        System.out.println(formatedSalary);

        //Percentage
        double passingGrade = .6;
        NumberFormat p = NumberFormat.getPercentInstance();

        String formattedPercentage =p.format(passingGrade);
        System.out.println(formattedPercentage);

        //Numbers
        double gasVolume = 123456.1234;
        NumberFormat g = NumberFormat.getNumberInstance();
        String formattedNumber = g.format(gasVolume);
        g.setMaximumFractionDigits(3);
        System.out.println(formattedNumber);
    }
}
