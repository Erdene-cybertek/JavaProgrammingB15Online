package day24_Array_Class_Method;

import java.util.Arrays;

public class Array_Method_toString {

    public static void main(String[] args) {

        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString ---->>> Arrays.toString(yourArrayHere)

        String[] superHereos = {"Superman", "Batman", "Spider-Man", "Aquaman", "Flash", "Thor"};
        System.out.println(Arrays.toString(superHereos));
//_________________________________________________________
        String example = Arrays.toString(superHereos);
        System.out.println(example.charAt(0));
//_________________________________________________________
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

//_________________________________________________________
        double[] price = new double[] {2.4, 3.66, 5.8 };
        System.out.println("Arrays.toString(price) = " + Arrays.toString(price));

        for (int i = 0; i < Arrays.toString(price).length(); i++) {
            System.out.println("Character at index " + i + " is " + Arrays.toString(price).charAt(i));

        }

        // for sorting an array in ascending order
        // sort ---->>> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals ---->>> Arrays.equals(firstArray,secondArray)




    }
}
