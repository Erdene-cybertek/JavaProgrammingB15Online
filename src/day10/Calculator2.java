package day10;

public class Calculator2 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        char operator = '*';

        switch (operator) {

            case '+' :
                System.out.println( num1 + num2 );
                break;
            case '*' :
                System.out.println( num1 * num2 );
                break;
            default:
                System.out.println("Invalid operator");


        }

    }
}
