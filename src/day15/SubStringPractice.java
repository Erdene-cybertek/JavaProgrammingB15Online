package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String
        //              0123456789012345
        String movie = "Lord Of The Ring" ; // Let's take "Of" & "The"

        // "Of" - index 5,6 --->> Gehdee substring gargahdaa
        // 5,6 ==> 5,7 "Of"
        // 8,10 ==>8,11 "The"

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8, 11);
        System.out.println("wordThe = " + wordThe);

        // Let's get from the second word till last word
           //              0123456789012345
        // String movie = "Lord Of The Ring" ;
        int startingPoint = movie.indexOf(" ") +1 ;
        int endingPoint = movie.length() ;
        System.out.println("second word till last :" + movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("Second word to Last word : " + secondWordTillLast);

        String secondToLast = movie.substring(5) ;

        System.out.println(movie.substring(12,16)+ movie.substring(4,12) + movie.substring(0,4));




    }
}
