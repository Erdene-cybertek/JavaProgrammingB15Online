package day04;

import java.util.Scanner;    // LOOK!!!!!!!!!!!!!

public class ScannerIntro {

    public static void main(String[] args) {

        // 1. import java.util.Scanner;
        // 2. Scanner scan = new Scanner(System.in);
        // 3. Ask question -->  System.out.println("Enter your first name please : ");
        // 4. String firstName = scan.next();
        // 5. Result -->  System.out.println("You have entered : " + firstName)

        Scanner scan = new Scanner(System.in);

        // Example 1

        System.out.println("Enter your first name please : ");
        String firstName = scan.next();
        System.out.println("You have entered : " + firstName);

        // Example 2

        System.out.println("Enter your age here : ");
        int age = scan.nextInt();
        System.out.println("Your age is : " + age);


    }


}