package day12_Must_Practice;

import java.util.Scanner;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month;

        System.out.println("What is your current month?");
        month = scan.nextInt();

        if (month<1 || month > 12 ) {
            System.out.println("INVALID MONTH");
        } else if(month >= 3 && month <= 5) {
            System.out.println("it's spring");
        } else if(month >= 6 && month <= 8) {
            System.out.println("it's summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("it's fall");
        } else if (month == 12 || month == 1 || month==2) {
            System.out.println("it's Winter");
        }

    }

}
