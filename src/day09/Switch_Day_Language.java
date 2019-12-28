package day09;

import java. util.Scanner;

public class Switch_Day_Language {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int language;
        String greeting = "";

        System.out.println("Please enter number between 1-5 !");
        language = scan.nextInt();

        switch (language) {

            case 1 :
                greeting = "Hello";
                break;
            case 2 :
                greeting = "Privet";
                break;
            case 3 :
                greeting = "Hola";
                break;
            case 4 :
                greeting = "Merhaba";
                break;
            case 5 :
                greeting = "Salem";
                break;
            default:
                greeting = "UNKNOWN";
        }

        System.out.println("You have selected : " + greeting);
    }

}