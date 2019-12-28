package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class String_To_Char_Array {

    public static void main(String[] args) {

        String name = "Alesya";

        char [] nameChars = new char [name.length()];

        // nameChars[0] = name.charAt(0);
        // nameChars[1] = name.charAt(1);

        for (int x = 0; x < nameChars.length; x++) {
            nameChars[x] = name.charAt(x);
        }
        System.out.println("nameChars = " + Arrays.toString(nameChars));

        System.out.println("_______Easy_Way__________________________________");

        char[] easyWay = name.toCharArray();
        System.out.println("easyWay = " + Arrays.toString(easyWay));




    }
}
