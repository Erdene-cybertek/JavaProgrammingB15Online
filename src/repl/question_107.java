package repl;

import java.util.*;

public class question_107 {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;

        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        digit1 = num/10000;
        digit2 = num/1000 % 10;
        digit3 = num/100 % 10;
        digit4 = num/10 % 10;
        digit5 = num % 10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);


    }
}
