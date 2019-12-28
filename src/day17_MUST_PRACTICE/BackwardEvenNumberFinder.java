package day17_MUST_PRACTICE;

public class BackwardEvenNumberFinder {

    public static void main(String[] args) {

        int x = 100;

        while (x > 0) {
            if (x %2 == 0 ) {
                System.out.print(x + " ");
            }
            -- x;
        } {
            System.out.println();
        }

        int y = 100;

        while (y > 0) {
            if (y %2 != 0) {
                System.out.print(y + " ");
            }
            -- y;
        }

    }

}
