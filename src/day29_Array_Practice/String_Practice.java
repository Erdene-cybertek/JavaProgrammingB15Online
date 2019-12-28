package day29_Array_Practice;

import java.util.Arrays;

public class String_Practice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String[] heroSplit  = hero1.split("-");

        System.out.println("heroSplit  = " + Arrays.toString(heroSplit) );;

        System.out.println("Hero code is " + heroSplit[0] + " and Identity is " + heroSplit[1]);

        System.out.println("=======================================");

        String fullName = heroSplit[1];

        String[] fullNameSplit = fullName.split(" ");

        System.out.println(" fullNameSplit = " + Arrays.toString(fullNameSplit));

        String lastName = fullNameSplit[fullNameSplit.length-1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is : " + fullName.charAt(0) + lastName.charAt(0));
        
//{"Superman-Clark Kent",
//"Batman-Bruce Wayne",
//"Wonder Woman-Princess Diana",
//"Aquaman-Arthur Orin Curry",
//"Wonder Woman-Princess Diana",
//"Cyborg-Victor Stone",
//"The Flash-Barry Allen ",
//"Green Lantern-Hal Jordan",
//"Green Arrow-Oliver Queen",
//"Atom-Ray Palmer",
//"Hawkman-Carter Hall",
//"Hawkgirl-Shiera Hall",
//"Zantana-Zantana Zatara",
//"Martian Manhunter-John Jones"}
    }
}
