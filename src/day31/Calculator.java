package day31;

public class Calculator {

    public static void main(String[] args) {

      add(15,2);
      add(100,234);
      add3Numbers(4,5,10);

    }

    public static void add( int num1, int num2){
        System.out.println( "Addition result : " + (num1 + num2) );
    }

    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println( "Addition result : " + (num1 + num2+num3) );
    }
}
