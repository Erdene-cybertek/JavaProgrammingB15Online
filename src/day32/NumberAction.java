package day32;

public class NumberAction {

    public static void main(String[] args) {

        repeatString("Java", 3);
        numberComparision(1,4);
        skipCountBy3From0to50();
        print1toX(10);
        countDownByEvenNumberFrom50to0();
        countDownByEvenNumberFromXtoY(30,10);

    }

    public static void repeatString(String strToRepeat, int count) {

        for (int i = 1; i <= count; i++) {
            System.out.println(strToRepeat + " ");

        }

    }

    public static void numberComparision(int number1, int number2) {

        if (number1 > number2) {
            System.out.println("num1 is more than num2");
        } else if (number2 > number1) {
            System.out.println("num2 is more than num1");
        } else {
            System.out.println("they are equal");
        }
    }

    public static void skipCountBy3From0to50() {

        for (int i = 0; i < 50; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print1toX(int x) {
        for (int i = 1; i < x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void countDownByEvenNumberFrom50to0() {

 //       for (int i = 50; i >= 0; i--) {
 //           if (i % 2 == 0) {
 //               System.out.print(i + " ");
 //           }
 //       }
//        System.out.println();
        countDownByEvenNumberFromXtoY( 50, 0);
    }
    public static void countDownByEvenNumberFromXtoY(int x, int y) {
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

}