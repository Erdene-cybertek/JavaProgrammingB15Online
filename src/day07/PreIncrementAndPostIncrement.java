package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        // increment

        int apple = 8;

        System.out.println(apple++);  // Hariu 8 garna, gehdee ++ "+1" daraagiin hariu deer nemegdene

        System.out.println( ++apple ); // Hariu 10 garna. ++ "1" umnuh ++ "1" nemegdeed 8+1+1=10 garna. Easy.

        int score = 50;

        System.out.println( ++ score);      // 51

        System.out.println( score ++);      // 51  ++ added next time

        System.out.println( score );        // 52

        System.out.println( -- score );     // 51



    }



}
