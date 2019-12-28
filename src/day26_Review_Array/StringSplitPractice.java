package day26_Review_Array;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {
        
        String students = "Kelsey, Erka, Tsoomoo, Geser, Gunchee, Alungoo";
        
        students = students.replace(" ","");

        System.out.println("students = " + students);

        String[] namesArray = students.split(",");

        System.out.println(Arrays.toString(namesArray));

        System.out.println("length of namesArray is " + namesArray.length);



        for (int x = 0; x < namesArray.length; x++) {

            String name = namesArray [x];

            System.out.println("Student name : " + name);

            for (int i = 0; i < name.length() ; i++) {

                System.out.print( name.charAt(i) + "-");
            }
            System.out.println();
        }
    }
}
