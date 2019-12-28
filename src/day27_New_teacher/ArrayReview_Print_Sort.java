package day27_New_teacher;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview_Print_Sort {

    public static void main(String[] args) {

        /* Array: a variable that allows us to store multiple values
             regular variable:
                        we can only store one single value
                            int a = 10;

             array variable:
                            int[] arr = {1, 2, 3};
                            index        0  1  2

             Array Must be converted to String in order to print!!!
         */

        int num = 10;
        int[] arr = {10, 20, 30, 40, 50,60};
        int numSize = arr.length;

        System.out.println(numSize);

        System.out.println("=============================");
        for (int x = 0; x < numSize ; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        System.out.println("=============================");

        System.out.println(Arrays.toString(arr));
        System.out.println("=============================");

        //Task1 create Array with Scanner
        // ask to print 5 numbers and store into array.
        // print the largest number

        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int y = 0; y < 5 ; y++) {
            System.out.println("Enter an int number : ");
            numbers[y] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        // largest number : need to sort : It is last index number
        Arrays.sort(numbers);
        System.out.println("Largest number is " + numbers[numbers.length-1]);
        System.out.println("Minimum number is " + numbers[0]);

        System.out.println("=============================");


    }
}
