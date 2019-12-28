package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

//        System.out.println("1 x 1 = " + 1 * 1 );
//        System.out.println("1 x 2 = " + 1 * 2 );
//        System.out.println("1 x 3 = " + 1 * 3 );

        for (int y = 1 ; y <= 10 ; y++) {
            System.out.println("Multiplication table " + y);

        for (int base = 1; base <= 10 ; base++) {
            System.out.println( y + " x " + base + " = " + y * base );
        }
        }


}
}
