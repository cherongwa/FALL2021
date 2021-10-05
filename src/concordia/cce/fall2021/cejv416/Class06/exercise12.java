package concordia.cce.fall2021.cejv416.Class06;

import java.util.Scanner;

public class exercise12 {

        public static void main(String[] args) {
        Scanner prov = new Scanner((System.in));

            System.out.println("Please Enter the first letter of the province 1=Quebec, 2=Alberta, 3=British columbia");
            int province = prov.nextInt();

            if (province <4 && province > 0){



            switch(province)
            {
                case 1:
                    System.out.println("Quebec");
                    break;
                case 2:
                    System.out.println("Alberta");
                    break;
                case 3:
                    System.out.println("British columbia");
                    break;

                     }
            }
            else

            System.out.println("Invalid  ");
        }
    }
