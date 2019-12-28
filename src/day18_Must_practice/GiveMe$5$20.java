package day18_Must_practice;

import java.util.Scanner;

public class GiveMe$5$20 {

    public static void main(String[] args) {

        // Keep asking for $5 or $20 until you get them

        Scanner scan = new Scanner(System.in);
        System.out.println(" Please give me 5 or 20!!");
        int x = scan.nextInt();

        //while ( x!=5 && x!=20)     ------->> this works too!!!
        while ( ! ( x==5 || x==20) ) {
            System.out.println("NOT THE BILL I AM LOOKING FOR");
            System.out.println("GIVE ME 5 OR 20");
            x = scan.nextInt();
        }

        System.out.println("THE HAPPY ENDING !! GOT THE MONEY ");
    }

}
