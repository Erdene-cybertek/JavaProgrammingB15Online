package day11;

public class LogicalOperator {

    public static void main(String[] args) {
        // combining multiple condition togerge r
        // in java there is no range check directly like math
        // for example   int x = 70
        // in math  :     60 < x < 100   -->>  true < 100
        // in Java  :      x > 60  && x <100
        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
        // Think about login example
        // only when your username is right and your password is right at the same time
        // then you will be able to login
        /*                  true       true
        * int x = 70 ;    x > 60  && x <100 ;  true
        *
                            false      true
        * int x = 10 ;    x > 60  && x <100 ;  false
        *
                            true       false
         *int x = 110 ;   x > 60  && x <100 ;  false
         *
                            true       true
         *int x = 99 ;    x > 60  && x <100 ;  true
         *
         *
        * */
        System.out.println( "TRUTH TABLE ");

        System.out.println( true && true );
        System.out.println( false && true );
        System.out.println( true && false );
        System.out.println( false && false );

        System.out.println( "RESULT OF true && true  is " +   (true && true)    );
        System.out.println( "RESULT OF false && true  is " +  (false && true)    );
        System.out.println( "RESULT OF true && false  is " +  (true && false)    );
        System.out.println( "RESULT OF false && false  is " + (false && false)    );

        System.out.println( "TRUTH TABLE ||");

        System.out.println( "RESULT OF true || true  is " +   (true || true)    );
        System.out.println( "RESULT OF false || true  is " +  (false || true)    );
        System.out.println( "RESULT OF true || false  is " +  (true || false)    );
        System.out.println( "RESULT OF false || false  is " + (false || false)    );




    }
}

