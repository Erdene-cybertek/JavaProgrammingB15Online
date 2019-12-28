package day27_New_teacher;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {

        int[] array1D = {1, 2, 3};

        // 2D array : is an array that contains single dimensional arrays
        //                    0 1 2      0 1 2
        int [] [] arr2D = {  {1,2,3} ,  {4,5,6}  };

        System.out.println(arr2D.length); // = 2
        System.out.println(Arrays.toString(arr2D[0])); // = [1, 2, 3]
        System.out.println(Arrays.toString(arr2D[1])); // = [4, 5, 6]

        System.out.println( arr2D[0][2] ); // = 3
        System.out.println( arr2D[1][1] ); // = 5

        // Arrays.deepToString(Multi-D Arrays)
        System.out.println(Arrays.deepToString(arr2D)); // = [[1, 2, 3], [4, 5, 6]]

    }
}
