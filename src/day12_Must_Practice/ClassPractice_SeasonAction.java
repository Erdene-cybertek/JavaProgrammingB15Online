package day12_Must_Practice;

import java.util.Scanner;

public class ClassPractice_SeasonAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season Please!!");
        String season = scan.next();

        if (season.equalsIgnoreCase("Spring")) {
            System.out.println("hiking, Navruz, Allergy Season, Cool weather");
        } else if (season.equalsIgnoreCase("Summer")) {
            System.out.println("Pool, Swimming, Beach, Vacation");
        } else if (season.equalsIgnoreCase("Fall")) {
            System.out.println("barbecue, riding bike, Just Code!!! , Halloween");
        } else if (season.equalsIgnoreCase("Winter")) {
            System.out.println("Code!!!! , Ski, sledding, snowman");
        } else {
            System.out.println("Invalid Month!!!!");
        }






    }
}
