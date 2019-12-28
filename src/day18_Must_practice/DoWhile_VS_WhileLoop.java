package day18_Must_practice;

public class DoWhile_VS_WhileLoop {

    public static void main(String[] args) {

        // "while" loop VS "do while"
        /*
        "while" loop check the condition first then enter the statement
        do while loop will take the action at least once them check the condition

        "Do while" loop always run at least one iteration
        while loop might not even run
         */

   int x = 1;

        do {
            System.out.println("Keep going");
            } while (x < 5 );

         System.out.println("The End");


    }
}