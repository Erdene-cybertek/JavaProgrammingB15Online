package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class String_To_Char_Array_Count_Sort {

    public static void main(String[] args) {

        String name = "Erdene-Ochir";
        char [] charName = name.toCharArray();

        int count = 0;
        for ( char eachCharacter : charName ){
            if (eachCharacter=='e') {
                ++count;
            }
        }
        System.out.println("count = " + count);

        Arrays.sort(charName);
        System.out.println(Arrays.toString(charName));

    }
}
