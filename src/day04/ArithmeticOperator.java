package day04;

public class ArithmeticOperator {

    public static void main(String[] arg) {

        // arithmetic operator between two int -->> another int

        System.out.println( 5 + 3 ); // 8
        System.out.println( 5 - 3 ); // 2
        System.out.println( 5 * 3 ); // 15
        System.out.println( 5 / 3 ); // 1

        // arithmetic operator between two numerical data type
        //  the final result will be larger data type

        System.out.println( 5 + 3.0d ); // 8.0
        System.out.println( 5 - 3.0d ); // 2.0
        System.out.println( 5 * 3.0d ); // 15.0
        System.out.println( 5 / 3.0d ); // 1.6666666666666667
        System.out.println( 5 / 3.0f ); // 1.6666666

       // store above numbers in variables
       // and replace above statement with variables instead
        // dataType result1 = the calculation here

        int horse = 1000;
        double cat = 50.0d;
        double resultHorse = (horse / cat);
        System.out.println(resultHorse);

        int num1    = 5;
        double num2 = 3.0d;
        float num3  = 3.0f;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 =  num1 / num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}
