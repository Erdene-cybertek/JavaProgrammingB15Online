package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.next(); // it will only captured 1st word (separated by space)
        // String anotherWord = scan.next();

        int age = scan.nextInt();

        System.out.println("You have entered name " + name);
        System.out.println("You have entered age " + age);




    }
}
