package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();
//        int start = 10;
//        int end = 27;

        System.out.println("You have started at speed -->> ");
        for (int i = start; i <= end; i++) {
                System.out.print(i + " ");

            }
        }
    }
