package day11;

public class ClassPractice_CheckScore {

    public static void main(String[] args) {

        int score = 30;

        if (score< 0 || score >100) {
            System.out.println("INVALID SCORE");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE");
        } else if (score >= 70 && score < 100 ) {
            System.out.println("YOU HAVE PASSED");
        } else if (score >= 40 && score < 70 ) {
            System.out.println("Little bit more study will let you pass");
        } else if (score >= 30 && score < 40 ) {
            System.out.println("Attend additional classes");
        } else {
            System.out.println("FAILED!!! Come to my office");
        }



    }
}
