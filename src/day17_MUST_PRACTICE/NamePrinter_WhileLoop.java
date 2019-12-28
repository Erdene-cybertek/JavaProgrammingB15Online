package day17_MUST_PRACTICE;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        // if you have complain in life : call 1-800-Alexander
        // get each and every character and print them vertically
        String name = "Erdene";

        int x = 0 ;

        while ( x < name.length()) {
            System.out.println("index " + x + " : " + name.charAt(x));
            ++x;

        }


    }
}
