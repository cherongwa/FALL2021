package concordia.cce.fall2021.cejv416.class03;

public class exercise5 {
    public static void main(String[] args) {
        float c1 = 30.0f;
        float f1 = 76.00f;

        float c1_in_f = 0.0f;
        float f1_in_c = 0.0f;

        //code here (math is done

        c1_in_f = ((9.0f/5)*c1) + 32;

        f1_in_c = (f1 - 32)/(9/5f);

        System.out.println("30C in F");
        System.out.println(c1_in_f);
        System.out.println("76F in C");
        System.out.println(f1_in_c);
    }
}
