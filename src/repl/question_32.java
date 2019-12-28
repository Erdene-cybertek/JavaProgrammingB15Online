package repl;

import java.util.Scanner;

public class question_32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds, days, weeks;

       System.out.println("Enter seconds:");
       inputSeconds = scan.nextInt();

        weeks = inputSeconds/7/24/60/60;
        days = (inputSeconds/24/60/60) % 7;
        hours = (inputSeconds /24/60) % 24;
        minutes = (inputSeconds / 60) % 60 ;
        seconds = inputSeconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
        System.out.println("Days: " + days);
        System.out.println("Weeks: " + weeks);
    }
}
