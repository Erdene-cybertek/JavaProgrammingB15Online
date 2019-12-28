package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double [] prices = new double[5];

        System.out.println(prices);

        prices[0]= 2.46;
        prices[1]= 12.96;
        prices[2]= 992.1;
        prices[3]= 500;
        prices[4]= 65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
//___________________________________________________________________
        char [] name  = new char [6];
        name [0] = 'E';
        name [1] = 'r';
        name [2] = 'd';
        name [3] = 'e';
        name [4] = 'n';
        name [5] = 'e';
        System.out.println(name [0]);
        System.out.println(name [1]);
        System.out.println(name [2]);
        System.out.println(name [3]);
        System.out.println(name [4]);
        System.out.println(name [5]);

        System.out.println( name );

//_________________________________________________________________________

        boolean[] yesNo = new boolean[3] ;
        System.out.println( yesNo [0]);
        System.out.println( yesNo [1]);
        System.out.println( yesNo [2]);

        yesNo [0] = true ;
        yesNo [1] = false ;
        yesNo [2] = 10>7 ;     // true

        System.out.println( yesNo [0]);
        System.out.println( yesNo [1]);
        System.out.println( yesNo [2]);
    }
}
