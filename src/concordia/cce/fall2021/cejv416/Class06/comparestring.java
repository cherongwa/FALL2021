package concordia.cce.fall2021.cejv416.Class06;

import jdk.swing.interop.SwingInterOpUtils;

public class comparestring {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(s1==s2);
        System.out.println(s1=s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("ABC");

    }
}
