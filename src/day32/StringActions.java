
package day32;

public class StringActions {

    public static void main(String[] args) {

        reversePrintMyOwnName();

        //String name = "Akbar";
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }

    public static void printStringWithDashInBetween(String name) {
        //String name = "Tokun" ;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index then I print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();

    }

    public static void reversePrintMyOwnName() {
        //             01234
        String name = "Akbar";

        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
        System.out.println();

    }


}