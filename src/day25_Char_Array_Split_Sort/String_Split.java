package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class String_Split {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence ? : " + allWords.length);
        System.out.println("Last word in this sentence is : " + allWords[allWords.length-1]);

        String sentence2 = "Everything is Awesome!!!";

        String[] salgay = sentence2.split("e");
        System.out.println("salgay = " + Arrays.toString(salgay));
        
        for ( String example : salgay){
            System.out.println("example = <" + example + ">");
        }
    }
}
