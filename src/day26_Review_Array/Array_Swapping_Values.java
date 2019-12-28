package day26_Review_Array;

import java.util.Arrays;

public class Array_Swapping_Values {

    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        String tempContainer = name1;
        name1 = name2;
        name2 = tempContainer;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        // swap the value of first item and last item

        int[] myNumbers = new int[] {10, 40, 30, 7 };

        int temp = myNumbers [0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;
        System.out.println(Arrays.toString(myNumbers)); // [7, 40, 30, 10]

        int temp2 = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = temp2;
        System.out.println(Arrays.toString(myNumbers));

    }
}
