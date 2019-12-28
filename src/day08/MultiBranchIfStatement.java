package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        int currentSpeed = 65;
        if (currentSpeed > 70) {
            System.out.println(" you are speeding more than 70 --POINTS TAKEN!!!!");

        } else if (currentSpeed > 60) {
            System.out.println("your speed is less than or equal 70 but more that 60 ");
        } else {
            System.out.println("KEEP DRIVING YOU ARE GOOD !!!");
        }

//

    }


}