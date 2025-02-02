package day11;

public class PrimitiveTypeEqualityCheck {

    public static void main(String[] args) {

        char c1 = 'b' ;
        char c2 = 'B' ;
        char c3 = 'b' ;

        System.out.println(" is c1 equal to c2");
        System.out.println(c1 == c2);

        System.out.println(" is c1 equal to c3");
        System.out.println(c1 == c3);

        // all primitive types can be compared using == for their content equality

        int num1 = 10;
        int num2 = 20;

        System.out.println(" is num1 equal to num2");
        System.out.println(num1 == num2);


    }
}
