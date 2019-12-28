package repl;

import java.util.Scanner;

public class question_108 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();

        for ( i = 1; i < n ; i++) {
            System.out.println("*");
            for ( j = 1; j < i+1 ; j++) {
                System.out.print("*");

            }
        }
        System.out.print("*");

    }
}