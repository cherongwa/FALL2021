package concordia.cce.fall2021.cejv416.Class06;

public class test {
    public static void main(String[] args) {
        String s1 = "ABC" ;
        String s2 = "ABC";

        boolean isqual = s1.equals(s2);

        if (isqual){
            System.out.println("The two are equal");
        }
        else
            System.out.println("The two strings are not equal");
    }
}
