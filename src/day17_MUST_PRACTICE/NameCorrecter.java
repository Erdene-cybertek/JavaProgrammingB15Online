package day17_MUST_PRACTICE;

import java.util.Scanner;

public class NameCorrecter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name");
        String name = scan.nextLine();
// option 1
       String nameFixed = (name.charAt(0)+"").toUpperCase();
       nameFixed = nameFixed + name.substring(1).toLowerCase();
        System.out.println(nameFixed);
// option 2
        String name2 = name.toUpperCase().substring(0,1) + name.substring(1).toLowerCase();
       System.out.println(name2);


    }
}
