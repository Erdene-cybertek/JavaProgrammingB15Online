package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5.0 / 2f);

        System.out.println("---- modulus . remainder --- ");

        System.out.println(5 % 2);

        System.out.println(99 % 10);

        System.out.println(100 % 10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert ");
        int minutes = scan.nextInt();   // 135 ; //60*2+15

        int hourPart = minutes / 60;     //135/60 ;  // -->> 2
        int minsPart = minutes % 60; // 135%60 ;  // -->> 15

        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + minsPart + " minutes");


    }


}