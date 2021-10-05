package concordia.cce.fall2021.cejv416.Class06;

import java.text.NumberFormat;

public class caseStatement {
    public static void main(String[] args) {

        NumberFormat f = NumberFormat.getNumberInstance();
       f.setMinimumFractionDigits(2);

        double salary = 60000.00;
        char employeeType = 'T'; // M= Management, R= Regular, T = Temp
        double bonus = 0.0;

        switch(employeeType)
        {
            case 'R':
                bonus = .1;
                break;
            case 'm':
                bonus = .05;
                break;
            default:
                bonus = .01;
                break;
        }
        double finalBonus = bonus * salary;
        System.out.println("Bonus will be  "+ f.format(finalBonus));
    }
}
