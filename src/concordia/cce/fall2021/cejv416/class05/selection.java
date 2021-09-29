package concordia.cce.fall2021.cejv416.class05;

import javax.swing.*;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        Scanner vote = new Scanner(System.in);


        System.out.println("How old are you?");
        int age = vote.nextInt();

        if(age>VOTING_AGE){
            System.out.println("You can vote");

             }

        else{
            System.out.println("Sorry, you can't vote, Come back in" + (VOTING_AGE-age) + "  years");
        }




        }
    }

