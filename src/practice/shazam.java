package practice;

import java.util.Scanner;

public class shazam {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is superheros name?");
        String superhero = scan.next();

        while ( ! superhero.equalsIgnoreCase("Shazam")) {
            System.out.println("wrong hero try again");
            superhero =  scan.next();
        }

        System.out.println("The End");
    }
}
