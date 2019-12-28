package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive
        /*
            Block comment, everything in between will be seen as comment

            whole number      : byte , short , int , double , long
            fractional number : float , double
            logical           : boolean (true , false)
            character         : char (single character in single quote)

            usually by default for whole number : just use int
            usually by default for fractional number just use double

            Is String part of Primitive types ?  :  No!!!!
            String is sequence of character

         */

        // age calculator
        // given birth year , please calculate the age

        int birthYear = 1990;
        int currentYear = 2019;
        int myAge;
        myAge = currentYear - birthYear;

        System.out.println("I was born in year " + birthYear + ", I am " + myAge + " years old" );

        // I was born in year 1990, I am 29 years old ;

        // Task 2: you are speeding today
        // speed limit is some number , and your current speed is this
        // generate this output of : You are driving 10mph more than speed limit

        int overTheLimit = 10;
        int speedLimit = 25;
        int currentSpeed;
        currentSpeed = speedLimit + overTheLimit;

        System.out.println("My current is " + currentSpeed + "mph.");







    }
}
