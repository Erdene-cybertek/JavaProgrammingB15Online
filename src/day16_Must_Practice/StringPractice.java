package day16_Must_Practice;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       System.out.println("Enter the keyword to search");
        String keywordToSearch = scan.nextLine();

        String tabTitle = keywordToSearch + " - Google Search";

        if (tabTitle.startsWith(keywordToSearch) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");


        }
    }

}
