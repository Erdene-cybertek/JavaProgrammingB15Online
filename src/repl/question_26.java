package repl;

import java.util.Scanner;

public class question_26 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num > 0) {
            System.out.println("positive");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

    }
}
