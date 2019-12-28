package repl;

import java.util.Scanner;

public class question_25 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a>b) {
            System.out.println(a + " is greater");
        } if (a<b) {
            System.out.println(b + " is greater");

        }

    }
}
