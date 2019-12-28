package day06;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        myFavoriteNumber = 200;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        String yourOrder = "Pizza";
        String myOrder = yourOrder;

        System.out.println("My order number is " + myOrder);
        System.out.println("Your order number is " + yourOrder);







    }

}
