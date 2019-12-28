package day13_Must_Practice;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far

        // equals
        String s1 = "Hello";
        System.out.println(  s1.equals("hello")  );
        // equalsIgnoreCase
        System.out.println(  s1.equalsIgnoreCase("Hello")  );

        // toUpperCase method of String is used to make String all character uppercase

        System.out.println(  s1   );
        // ----> UpperCase
        System.out.println(  s1.toUpperCase()    );  // hello --> HELLO
       // ----> LowerCase
        System.out.println(  s1.toLowerCase()    );  // HELLO --> hello
        // ------> Length ----- = it counts number of characters!!
        System.out.println(  s1.length()         );  // Hello --> 5

        int lengthOfStr = s1.length();

        if (lengthOfStr > 4 ) {
            System.out.println("More than 4 character");
        } else {
            System.out.println("not more than 4");
        }




    }


}
