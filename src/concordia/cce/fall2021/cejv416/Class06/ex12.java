package concordia.cce.fall2021.cejv416.Class06;

import java.util.Scanner;

public class ex12 {



        public static void main(String[] args) {
            Scanner sc = new Scanner((System.in));

            System.out.println("Please Enter a province code QC=Quebec, AB=Alberta, BC=British columbia");
            String provinceName = null;
            String provinceCode = sc.nextLine();

                switch(provinceCode.toUpperCase().trim())
                {
                    case "QC":
                        provinceName = "Quebec";
                        break;
                    case "AB":
                        provinceName = "Alberta";
                        break;
                    case "BC":
                        provinceName = "British Columbia";
                        break;
                    default:
                        provinceName = "not found / Invalid";
                }
            System.out.println("The province name for the province code " + provinceCode + " is " + provinceName);


        }
    }


