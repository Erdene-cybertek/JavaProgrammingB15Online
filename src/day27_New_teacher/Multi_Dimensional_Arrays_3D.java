package day27_New_teacher;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_3D {

    public static void main(String[] args) {

        // 2D Array: contains 1D dimensional array
        int [] [] arr2D = { {1,2,3}, {4,5,6} };
        //                     0        1
        //                   0 1 2     0 1 2

        // 2D Array: contains 1D dimensional array
        int [] [] [] arr3D = {  { {1,2,3},{4,5,6} }  ,  { {7,8,9},{10,11,12} }  };
        //                               0                       1
        //                           0       1               0        1
        //                         0 1 2   0 1 2           0 1 2    0  1  2

        // print 9
        System.out.println(arr3D[1][0][2]);

        // print 2
        System.out.println(arr3D[0][0][1]);

        // print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));

        // print {10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));

        // print {{7,8,9} , {10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1]));

        // print all
        System.out.println( Arrays.deepToString(arr3D));

        System.out.println("==================================================");






    }
}
