package day13_Must_Practice;

public class Double_IF_Statement {

    public static void main(String[] args) {

        // create a boolean store the result of youWantToShop
        // if yes , do up want to go to Store or do you wanna shop Online

        boolean youWantToShop = true;
        String preference = "store";

        // if (youWantToShop) exactly same

        if ( youWantToShop == true) {

            if (preference.equalsIgnoreCase("store")) {
                System.out.println("going to store for shopping");
            } else {
                System.out.println("going to online for shopping");
            }

        } else {
            System.out.println("good job stay home coding!!!");
        }











    }

}
