package day16_Must_Practice;

public class WhileLoopIntro {

    public static void main(String[] args) {

        int count = 1;

        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");

        System.out.println("Count is " + count);

        System.out.println("--------------");

        int cnt = 1;

        while (cnt <= 5) {
            System.out.println("Hello");
            System.out.println("cnt value is : "+cnt);
            ++cnt;     //  cnt = 1 ees cnt = 5 hurtel 5 udaa "Hello" gej print hiine
        }


    }
}
