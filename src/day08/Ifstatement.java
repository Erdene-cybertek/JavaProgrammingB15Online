package day08;

public class Ifstatement {

    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSpeed = 145;


        boolean IamSpeading = yourCurrentSpeed > speedLimit;

        if (yourCurrentSpeed > speedLimit) {

            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        } else {
            System.out.println("go shopping !!");
            System.out.println("Buy IceCream !!");
            System.out.println("Enjoy your Day !!");
        }

        System.out.println("THE END");



    }


}