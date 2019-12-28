package day24_Array_Class_Method;

public class ShoppingWithArray {

    public static void main(String[] args) {

        /*
        Create a String array of 6 items to store groceryItems
        {"apple","banana","grape","strawberry","blueberry","kiwi"}
        Create a float array of 6 float values to store prices
        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        assume that the order of grocery Items match the prices in same order.
         */

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        // 1, loop through each grocery items and print them in one line

        for (String eachFruit : groceryItems) {
            System.out.print(eachFruit);
            System.out.print(" -->> ");
        }
        System.out.println("_________________________________");

        String lastFruit = groceryItems[groceryItems.length - 1];
        System.out.println("lastFruit = " + lastFruit);

        // print without last arrow.

        for (String eachFruit : groceryItems) {

            System.out.print(eachFruit);
            if ( ! eachFruit.equals(lastFruit)){
                System.out.print(" -->> ");

            }
        }

    }

}