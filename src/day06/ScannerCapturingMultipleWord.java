package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("What is your name? ");
        String name = scan. nextLine();
        System.out.println("You have entered : " + name);

        System.out.println("Which city you live in? Please include state ");
        String city = scan. nextLine();
        System.out.println("You have entered : " + city);

        System.out.println("What is your address? ");
        String address = scan.nextLine();
        System.out.println("You have entered : " + address);


    }

}
