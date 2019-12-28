package day15;

import java.util.Scanner;

public class nameChecker_length_contain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? " );
        String name = scan.next();

        int nameOfTheLength = name.length();
        System.out.println("name of the length is : " + nameOfTheLength);

        if (name.length()<4 ) {
            System.out.println("short name : " + name);
        } else if (name.length()>= 4 || name.length() <= 11) {
            System.out.println("Medium  name : " + name);
        } else {
            System.out.println("Longer name : " + name);
        }

        //--------------------------------------------------------

        if (name.contains("a") || name.contains("e") ) {
            System.out.println("name contains a or e ");
        } else {
            System.out.println("I don't have both a or e in my name");
        }





    }

}
