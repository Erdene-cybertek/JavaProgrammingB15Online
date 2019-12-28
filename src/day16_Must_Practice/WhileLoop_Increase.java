package day16_Must_Practice;


public class WhileLoop_Increase {

    public static void main(String[] args) {

        int x = 1;

         while (x <=5) {
             System.out.println("Hello World");
             ++x ;    // x++; -->> increase 1 6 times, instead of 5 times
         }{ System.out.println("-----------"); }

        int y = 1;
         while (y < 6) {
             System.out.println("y = " + y);
             ++y;
        }{ System.out.println("-----------"); }

         int z = 1;

         while ( z < 6 ) {
             System.out.println( z++ );
             // 2 dah printeesee 1g nemeed yavna

         }{ System.out.println("-----------"); }
        int t = 0;
         while (++t <=5) {
             System.out.println("t = " + t);

         }{ System.out.println("-----------"); }

         int r = 0;
         while (r++ <5) {
             System.out.println("r = " + r);
             
         }
    }

}
