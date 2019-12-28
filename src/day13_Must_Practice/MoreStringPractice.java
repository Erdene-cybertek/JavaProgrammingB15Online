package day13_Must_Practice;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Erdene";
        System.out.println(  name  );

        name = "Kelsey" ;
        System.out.println(   name );

        // String is immutable, once created It can not be changed
        // any String actions/methods that looks like changing the variable

        name.toUpperCase();         // not work
        System.out.println(name);

        System.out.println( name.toUpperCase());

        name = name.toLowerCase();     //  works
        System.out.println(name);

    }
}
