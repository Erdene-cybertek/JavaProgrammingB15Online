package day31;

public class Greeting {

    public static void main(String[] args) {

        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("Kids");

    }

    public static void sayHelloTo( String name ){
        System.out.println(" Hello " + name);
}


    public static void sayHello(){

        System.out.println("Hello B15");
    }
}
