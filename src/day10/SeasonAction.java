package day10;

import java.util.Scanner;

public class SeasonAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please tell me one favorite season? ");
        String season = scan.next();

        switch (season) {

            case "Spring":
                season = "Hike, Easter, Blossom";
                break;
            case "Summer":
                season = "Swim, Vacation";
                break;
            case "Fall":
                season = "Thanksgiving, Black Friday";
                break;
            case "Winter":
                season = "Christmas, New Year, Ski";
                break;
            default:
                season = "no other season";
        }

        System.out.println("Things to do in your favorite season : " + season);
    }
}