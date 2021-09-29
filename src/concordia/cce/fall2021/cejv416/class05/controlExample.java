package concordia.cce.fall2021.cejv416.class05;

public class controlExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String c = "Concordia";
        System.out.println(c == "Concordia"); // this will give true, but misleading
        System.out.println(c.equals("concordia"));


        boolean empty;
        empty = true;

        if (!empty) {
            //do this
        }
    }
}