package day15;

public class StingCaseSensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println( "name contains st RESULT IS : " + name.contains("st"));    // false

        String uppercaseName = name.toUpperCase() ;  // ARYA STARK
        System.out.println("uppercaseName contains ST or not ? " + uppercaseName.contains("ST"));


        String lowercaseName = name.toLowerCase() ;   // arya stark
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st"));

        // "st contain hiijiinuu geed haihleer ter ugend "st" orson mortloo false buyu baihgui gej garch irne"
        // uppercase and lowercase bolgood haihleer "true buyu baina gej garch irdeg "

        System.out.println(name.toLowerCase().contains("st"));
        // Esvel lowercase & contain 2g deerh jishee shig niluuleed haij bolno









    }
}
