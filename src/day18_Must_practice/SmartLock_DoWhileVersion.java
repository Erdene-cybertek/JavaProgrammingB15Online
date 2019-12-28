package day18_Must_practice;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args) {

        // smart lock door has password
        // unless you enter correct password
        // it keep locking you out
        // assuming correct password is B15
        // keep asking until user enter correct one

        Scanner scan= new Scanner(System.in);

        System.out.println("Knock Knock!!!!");
        String password;

        do {
            System.out.println("What is the password ? ");
            password = scan.next();
        } while ( ! password.equalsIgnoreCase("B15"));

        System.out.println("Door is opening");
    }
}
