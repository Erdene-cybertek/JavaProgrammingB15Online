package day17_MUST_PRACTICE;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // count 1 ti 5 then count 5 to 1

        int x = 1;

        while (x <= 5) {
            System.out.print(x + " ");
            ++x ;
        }

        System.out.println();
        System.out.println("x = " + x);

        while (x > 1) {
            --x;
            System.out.print(x + " " );
        }
        System.out.println();
        System.out.println("x = " + x);


    }
}
