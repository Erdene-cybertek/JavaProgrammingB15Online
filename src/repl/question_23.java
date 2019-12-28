package repl;

import java.util.Scanner;

public class question_23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int areaCode;
        int localNumber;
        String phoneNumber = "";

        System.out.println("Enter area code :");
        areaCode = scan.nextInt();

        System.out.println("Enter local number :");
        localNumber = scan.nextInt();

        phoneNumber = "(" +areaCode + ")-" + localNumber;

        System.out.println("Calling number " + phoneNumber);
    }
}
