package day10;

import java.util.Scanner;

public class Switch_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String order = "";
        int itemNumber;

        System.out.println("Which item number do you want to order? " );
        itemNumber = scan.nextInt();

        switch (itemNumber) {
            case 1:
                System.out.println("You have selected 1");
                order = "Cheeseburger";
                break;
            case 2:
                System.out.println("You have selected 2");
                order = "French Fries";
                break;
            default:
                System.out.println("You have selected nothing");
                order = "unknown";
        }

        System.out.println("Your order is " + order);


    }
}
