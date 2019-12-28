package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String company;

        System.out.println("What is your first name? ");
        firstName = input.nextLine();

        System.out.println("What is your last name? ");
        lastName = input.nextLine();

        System.out.println("What company do you work? ");
        company = input.nextLine();

        String email = firstName + "_" + lastName + "@" + company+".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);


        System.out.println("Enter your first name , last name , company seperated by space : ");

        firstName = input.next();
        lastName = input.next();
        company = input.next();
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);


        /* teacher suggestion
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name , last name , company seperated by space : ");

        String firstName, lastName, company, email;
        firstName = "Astrit";
        lastName = "Enver";
        company = "Verizon";
        firstName = scan.next();   //"Astrit";
        lastName = scan.next();   //"Enver";
        company = scan.next();   //"Verizon";
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);
        System.out.println(" My name is " + firstName + " "
                + lastName + " and I work for " + company
                + " and my email is " + email);
         */



    }


}
