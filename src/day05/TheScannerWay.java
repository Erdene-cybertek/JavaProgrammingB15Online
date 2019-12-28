package day05;

import  java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = scan.next();          //String name = "Sam";
        System.out.println("Your name is " + name);

        System.out.println("What is your birth year? : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is  " + age);

        System.out.println("What is your height? :");
        double height = scan.nextDouble();
        System.out.println("Your height is : " + height);

        /*   What is your name? :
             Erdene
             Your name is Erdene
             What is your birth year? :
             1990
             Your age is  29
             What is your height? :
             5.6
             Your height is : 5.6  */

        // Scanner is class that comes from JDK library
        //We can use it to capture keyboard input from users
        //In order to use Scanner we need to first import it as below
        //Import java.util.Scanner ;
        //The import statement must be in between your package declaration and before the beginning of the class
        //// Create scanner object
        //Scanner scan = new Scanner(System.in);
        //There is few ways to get users input and store the result
        //Getting single word as String                —> scan.next() ;
        //Getting single number as int                 —> scan.nextInt() ;
        //Getting single fractional number as double   —> scan.nextDouble() ;
        //Getting single fractional number as float    —> scan.nextFloat() ;
        //Getting single true or false as boolean      —> scan.nextBoolean() ;


    }
}
