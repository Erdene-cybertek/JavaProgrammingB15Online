package day31;

public class MethodPractice {

    public static void main(String[] args) {

    MethodIntro.sayHello();  /// from day31 --- MethodIntro
        System.out.println("----------------------------------");
    sayHelloWorld7Times();
        System.out.println("----------------------------------");
    MethodPractice.sayHelloWorld7Times();
        System.out.println("----------------------------------");
    calculateMathProblem();

    }

    public static void sayHelloWorld7Times(){

 // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.println("Hello world line 4 ");
        System.out.println("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");

    }

    public static void calculateMathProblem(){

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}
