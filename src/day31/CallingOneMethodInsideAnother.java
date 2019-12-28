package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        finallyAwake();
        System.out.println("_________________");
        drinkCoffee();

    }

    public  static void finallyAwake (){ // inside bottom the method added

        wakeUp();
        drinkCoffee();

    }

    public static void wakeUp(){
        System.out.println("Open you eye");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("-----------------");

    }

    public static void drinkCoffee(){

        System.out.println("Put your coffee in your coffee machine ");
        System.out.println("Press the button Make your coffee");
        System.out.println("-----------------");
    }
}
