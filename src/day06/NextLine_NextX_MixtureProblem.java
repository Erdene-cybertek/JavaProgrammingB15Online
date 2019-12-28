package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name  );

        System.out.println("What is your age? ");
        int age = scan.nextInt();       // option 1
        scan.nextLine();                // option 1
        //String age = scan.nextLine(); // option 2
        System.out.println("Your age is " + age  );

        System.out.println("What is your address? ");
        String address = scan.nextLine();
        System.out.println("Your address is " + address);





    }
}
