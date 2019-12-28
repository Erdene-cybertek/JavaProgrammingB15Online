package day31;

// WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE !!!! AVOID CODE DUPLICATED

public class MethodIntro {

    public static void main(String[] args) { // main method starts here

        // two ways to call static method
        System.out.println("Begin ---------------------");
        MethodIntro.sayHello();
        System.out.println("-----------------------");
        sayHello();
        System.out.println("THE END---------------------");

    } // "main" method end here

    public static void sayHello(){

        System.out.println("Hello World");
        System.out.println("My name is Erka");
        System.out.println("I love Java");


    }

}
