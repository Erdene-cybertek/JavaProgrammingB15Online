package day24_Array_Class_Method;

import java.util.Arrays;

public class Arrays_Method_Sort {

    public static void main(String[] args) {

    int[] scores = {95,44,66,100,23,19,54, 2 };

        System.out.println(Arrays.toString(scores));
        System.out.println("      old 1st item value      :     " + scores[0]);
        Arrays.sort(scores);
        // low to high order
        System.out.println(Arrays.toString(scores));

        //_________________________________________________________

        System.out.println("      new 1st item value      :     "  + scores[0]);

        //_________________________________________________________

        char[] nameChars = new char [] {'G', 'A', 'D', 'Z', 'C', 'A', ' ', 'a', 'c', 'd', '6', '1', '3' };
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        // sorting orders: space ' ', numbers-> low to high, Cap letters -> A to Z, small letters ->a to z (ASCII TABLE order)
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));

        //_________________________________________________________

        String[] superHereos = {"Superman", "Batman", "Spider-Man", "Aquaman", "Flash", "Thor", "100" , "88", "7", "22"};
        Arrays.sort(superHereos);
        System.out.println(Arrays.toString(superHereos));

    }

}
