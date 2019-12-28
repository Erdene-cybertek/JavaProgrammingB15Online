package day12_Must_Practice;

public class WarmUp_FizzBuzzNumberCheck {

    public static void main(String[] args) {

        int number = 9;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz number");
        } else if (number % 3 == 0) {
            System.out.println("it's Buzz number");
        } else if (number % 5 == 0) {
                System.out.println("it's Fizz number");
        } else {
            System.out.println("NOT MY NUMBER");
        }

    }
}
