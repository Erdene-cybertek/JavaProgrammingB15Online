package day18_Must_practice;

public class ForLoopIntro {

    public static void main(String[] args) {

        // count 1 to 5
        // for loop () has 3 parts separated by ;
        // first part initialization :
            // it will run only once when you enter the loop
        // second part termination condition :
            // loop will stop if it's false
            // it will be checked every time
        //

        for (int x=1; x<=5 ; ++x ) {
            System.out.println("x = " + x);
        }

        System.out.println("---------------");

        for (int y = 5; y > 0 ; y-- ) {
            System.out.println("y = " + y);
        }


    }
}
