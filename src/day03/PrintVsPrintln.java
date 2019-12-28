package day03;

public class PrintVsPrintln {

    public static void main(String[] args) {

        // 3 print line statement
        System.out.println("Hello world line 1");
        System.out.println("Hello world line 2");
        System.out.println("Hello world line 3");

        // 2 print statement
        System.out.print("Hello world line 4");
        System.out.print("Hello world line 5");

        // 2 print line statement
        System.out.println("Hello world line 6");
        System.out.println("Hello world line 7");

        //Result will look like:
        //Hello world line 1
        //Hello world line 2
        //Hello world line 3
        //Hello world line 4Hello world line 5Hello world line 6
        //Hello world line 7

        System.out.print("This is regular \n");
        System.out.println("This is println");

    }

}
