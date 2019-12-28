package day31;

public class MethodPractice2 {

    public static void count1to10() {

        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {

        // write piece of reusable code to count1 to 10

        count1to10();
        System.out.println();
        MethodPractice2.count1to10();


    }
}