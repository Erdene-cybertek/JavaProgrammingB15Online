package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class String_Split_Find_LongestWord {

    public static void main(String[] args) {

        String sentence = "We are trying to find longest word";

        String [] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        String longestWord = allWords[0];
        
        for ( String currentWord : allWords) {

           if (currentWord.length() > longestWord.length()) {
               longestWord = currentWord;
           }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
