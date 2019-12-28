package day10;

import java.util.Scanner;

public class MultiBranch_practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald, what can I get for you?");

        Scanner scan = new Scanner(System.in);

        String order = "";
        int itemNumber;

        itemNumber = scan.nextInt();

        if (itemNumber == 1) {
            System.out.println("You have selected 1");
            order = "Cheeseburger";
        } else if (itemNumber == 2) {
            System.out.println("You have selected 2");
            order = "French Fries";
        } else {
            System.out.println("You have selected unknown entry");
            order = "unknown";

        }

        System.out.println("Your order is " + order);
    }

}