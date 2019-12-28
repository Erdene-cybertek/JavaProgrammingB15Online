package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // double regularPrice;
        // double salePrice;
        // double discount;

        double regularPrice , salePrice, discount ;

        System.out.println("What it the regular price ?");
        regularPrice = scan.nextDouble();

        System.out.println("What is the percentage of discount? ");
        discount = scan.nextDouble();

        salePrice = regularPrice -  regularPrice * discount;

        System.out.println("regular price is " + regularPrice + "$ , discount is " + discount +
                " , and you got deal for " + salePrice + "$");

















    }
}
