package day21_Nested_Loop;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <= 10 ; x++) {

            System.out.println("Hello" + x);
            continue;           // ----> 10 bugdiig hevlene
         //   break;   ------> 1 l print hiigeed zogsono
        }
        System.out.println("The End");
    }
}
