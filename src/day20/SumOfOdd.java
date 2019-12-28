package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 10; i <= 100; i++) {

            if (i % 2 == 1) {
                sumOfOdd += i;
            } else {
                sumOfEven += i;

            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}