package day27_New_teacher;

public class Array_Practice_3D {

    public static void main(String[] args) {

        int [] [] [] arr3D = {  { {1,2,3},{4,5,6} }  ,  { {7,8,9},{10,11,12} }  };

        for (int x = 0; x < arr3D.length; x++) {
            for (int y = 0; y < arr3D[x].length ; y++) {
                for (int z = 0; z < arr3D[x][y].length; z++){
                    System.out.print(arr3D[x][y][z] + " ");

                }
            }

        }

    }
}
