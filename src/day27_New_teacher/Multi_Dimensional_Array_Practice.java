package day27_New_teacher;

import java.util.Arrays;

public class Multi_Dimensional_Array_Practice {

    public static void main(String[] args) {

        String[][] names = {{"Erka", "Tsoomoo"}, {"Minii huu", "Kelsey"}};

        // print "Minii huu"
        System.out.println(names[1][0]); // = "Minii huu"

        names[1][1] = "Nandin";
        System.out.println(names[1][1]); // =  Nandin

        System.out.println(Arrays.toString(names[1])); // = [Minii huu, Nandin]
        System.out.println(Arrays.deepToString(names)); // = [[Erka, Tsoomoo], [Minii huu, Nandin]]

        System.out.println("\n==================================================");

        int[] [] numbers = { {1,2,3} , {4,5,6,7} , {8,9} };
        //                     0         1         2

        for (int x = 0; x < numbers.length; x++) {
            System.out.println(Arrays.toString(numbers[x]));
        }

        System.out.println("\n==================================================");

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers[x].length ; y++) {
                System.out.print(numbers[x][y] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(numbers));

        System.out.println("\n==================================================");

        int[] [] ages = {{10}, {12,13,14,16,17}, {19,20,21,22,23}};

        for (int x = 0; x < ages.length; x++) {
            for (int y = 0; y < ages[x].length; y++) {
                if (ages[x][y] % 2 == 1){
                continue;
            }
            System.out.print(ages[x][y] + " ");
            }
        }

        // 2nd Option to print

        System.out.println("\n==================================================");

        int[] arr1D = {1,2,3};
        for( int  each : arr1D ) {
            System.out.print(each+" ");
        }

        System.out.println("\n==================================================");

        int [][] arr2D = {{10,20,30} , {40, 50, 60, 70, 80, 90, 100}};
        for ( int[] each1DArray : arr2D ) {
           for (int eachElement : each1DArray)
            System.out.print(eachElement+ " ");
        }




    }
}
