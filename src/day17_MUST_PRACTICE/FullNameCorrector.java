package day17_MUST_PRACTICE;

import java.util.Scanner;

public class FullNameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name ?");
        String fullName = scan.nextLine();

        //                 0123456789
 //       String fullName = "aRya sTaRk";

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1 );

  //     String firstName = fullName.substring(0,4);
 //       String lastName = fullName.substring(5);

       String firstNameCorrected = firstName.substring(0,1).toUpperCase()
               + firstName.substring(1).toLowerCase();
       System.out.println(firstNameCorrected);

       String lastNameCorrecter = lastName.substring(0,1).toUpperCase()
               + lastName.substring(1).toLowerCase();
        System.out.println(lastNameCorrecter);

        fullName = firstNameCorrected + " " + lastNameCorrecter;
        System.out.println(fullName);
    }
}
