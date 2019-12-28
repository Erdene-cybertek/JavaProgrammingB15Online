package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';             // B
        System.out.println(grade);

        // 'B' is represented by 66 in ASCII Table
        // here type char is automatically widened to int
        // stored as number
        int letterInNumber = 'B';        // 66
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b' ;       // 98
        System.out.println(letterInNumber2  );

        // -------------------

        char myFirstChar = 100;           // d
        System.out.println(myFirstChar);

        //--------------


        char letterA = 'a';
        //  adding a character to a int number will result in int
        //  (int) letterA   + 1
        System.out.println(letterA + 1);

        System.out.println(" " + letterA + 1);




    }

}
