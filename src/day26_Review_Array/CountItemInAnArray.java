package day26_Review_Array;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

    String[] marvelHeroes = {"Iron Man", "Captain America", "Spider-Man",
                             "Black Panther", "Hulk", "Black Widow ", "Thor", "Captain Marvel",
                             "Iron Man", "Captain America", "Spider-Man"};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));

        int size = marvelHeroes.length;
        System.out.println("Hero count = " + size );

        String itemToSearch = "Iron Man";
        int countOfItem = 0;

        for ( String eachHeroes  : marvelHeroes) {

           if(eachHeroes.equals((itemToSearch))){
               ++countOfItem;
               System.out.println(eachHeroes);
           }

        }
        System.out.println("How many Iron Man in Array : " + countOfItem);


        int countOfBlack = 0;
        for ( String eachHeroes  : marvelHeroes) {

            if(eachHeroes.contains("Black")){
                ++countOfBlack;
                System.out.println(eachHeroes);
            }

        }
        System.out.println("How many contain 'Black' in Array : " + countOfBlack);

    }

}
