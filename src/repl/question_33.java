package repl;

import java.util.Scanner;

public class question_33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int drinkCount = scan.nextInt();

       int overDose = 10000;

        System.out.println("It would take about " + overDose/drinkCount + " drinks for a lethal overdose.");

    }

}
