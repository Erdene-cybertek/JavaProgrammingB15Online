package day18_Must_practice;

public class EvenNumber_ForLoop
{
    public static void main(String[] args) {

        
        for (int x = 2; x <= 10 ; x += 2) {
            System.out.println("x = " + x);

        }

        System.out.println("-------------");

        for (int z = 0 ; z < 10 ; z++) {
            if (z % 2 == 0) {
                System.out.println(z + " is even number");
            }
        }

        for (int i = 0; i < 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println(i + " is FizzBuzz number");

            }
        }
            // everything you can do with the for loop -->> can be done using while loop !!!



    }
}
