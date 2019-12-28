package day29_Array_Practice;

import java.util.Arrays;

public class Practice_300_I_love_java {

    public static void main(String[] args) {

        String[] word = new String [300] ;

        for (int x = 0; x < word.length ; x++) {
            word[x] = "I love Java";
            System.out.println(x + 1 + " = " + word[x]);
        }
        System.out.println(Arrays.toString(word));

        System.out.println("============================================");

        String str = new String("ABC");
        String[] word2 = new String[5];
        word2[0] = "i LOVE JAVA";
        word2[1] = "i LOVE JAVA";
        word2[2] = "i LOVE JAVA";
        word2[3] = "i LOVE JAVA";
        word2[4] = "i LOVE JAVA";
        System.out.println("word2 = " + Arrays.toString(word2));
    }
}
