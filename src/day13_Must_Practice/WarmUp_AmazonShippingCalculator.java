package day13_Must_Practice;

import java.util.Scanner;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

    // amazon has prime member & regular member
    // prime member gets free shipping with any amounts of purchase
    // regular member gets free shipping over $25 of purchase,
        // if not pay shipping fee of $25.

        String memberType = "";
        double amount = 25.99d;
        int shippingFee = 0 ;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your member status? (Prime member or regular member)");
        memberType = scan.nextLine();

        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You get 1 day free shipping");
            System.out.println("Your final price is " + amount);
        } else if (! memberType.equalsIgnoreCase("Prime member") &&  amount> 25) {
            System.out.println("Not Prime member but your order is more than $25");
            System.out.println("You got free shipping on amount of " + amount);
        } else {
            System.out.println("Do you wanna sign up for prime membership? ");
            shippingFee = 5;
            amount += shippingFee;
            System.out.println("Your price is $"+ amount + ", shipping fee included  ");




        }





    }

}
