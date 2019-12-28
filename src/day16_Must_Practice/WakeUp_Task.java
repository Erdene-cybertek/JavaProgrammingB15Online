package day16_Must_Practice;

import java.util.Scanner;

public class WakeUp_Task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word that you want to reverse : ");

        String word1 = scan.next();

        String word2 = (word1.charAt(3) + "" + word1.charAt(2) + "" + word1.charAt(1) + "" + word1.charAt(0));

        System.out.println(word2);

        // I want to add world at the end of it
        String msg = "Hello ";
        //msg = msg + "World!" ;
        msg += "World!";
        System.out.println("msg = " + msg);


    }

}
