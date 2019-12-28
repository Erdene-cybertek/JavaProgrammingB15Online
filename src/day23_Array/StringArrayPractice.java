package day23_Array;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = {"Orville", "Gifted", "Game of Throne",
                          "Flash", "Arrow", "Super Girl"};

        int showCount = shows.length;
        System.out.println("showCount = " + showCount);

        for (int x = 0; x < shows.length; x++) {
            System.out.println(shows[x] + " has character count: " +shows[x].length()  );
        }
// Another example for length of array count VS length of single array's length
        String myFavoriteShow = shows[0];
        System.out.println("myFavoriteShow = " + myFavoriteShow);
        System.out.println("my favorite show character count os : " + myFavoriteShow.length());



    }
}
