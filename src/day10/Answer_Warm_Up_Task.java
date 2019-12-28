package day10;

public class Answer_Warm_Up_Task {

    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 247;

        if (myNumber % 5 == 0) {
            myAnswer = "Fizz Number";
        } else {
            myAnswer = "Not Fizz Number";
        }

        System.out.println("print my number is " + myNumber + ", It is " + myAnswer);


    }

}
