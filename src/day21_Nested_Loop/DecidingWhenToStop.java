package day21_Nested_Loop;

public class DecidingWhenToStop {

    public static void main(String[] args) {

        String msg ="Hello World";

        int charCount = msg.length();

        int n = 1;

        for (int x = 0; x <= charCount - n ; x++) {

            System.out.println(msg.substring( x + n));
        }
    }
}
