package practice;

import java.util.Scanner;

public class If_Else_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your grade ? ");

        int grade = scan.nextInt();

        if (grade > 100) {
            System.out.println("Not Exist");
        } else if (grade > 89) {
            System.out.println("You got A!");
        } else if (grade > 79) {
            System.out.println("You got B!");
        } else if (grade > 69) {
            System.out.println("You got C!");
        } else if (grade > 59) {
            System.out.println("You got D!");
        } else {
            System.out.println("You got F!");

        }

        System.out.println("Good luck next time!");

    }
}