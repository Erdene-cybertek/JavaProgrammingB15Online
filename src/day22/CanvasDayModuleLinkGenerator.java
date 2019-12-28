package day22;

public class CanvasDayModuleLinkGenerator {

    public static void main(String[] args) {

        /*
        https://learn.cybertekschool.com/courses/278/modules#3317
        this will lead you to day 21
        https://learn.cybertekschool.com/courses/278/modules#3318
        this will lead you to day 22
        https://learn.cybertekschool.com/courses/278/modules#3319
        this will lead you to day 23
        https://learn.cybertekschool.com/courses/278/modules#3320
        this will lead you to day 24
         */

        String URL = " https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "This will lead you to day ";
        int startingModuleNumber = (3317 - 21);

        for (int day = 21; day <=56 ; day++) {

            System.out.println(dayMsg + day);
            System.out.println(URL + (startingModuleNumber + day));


        }







    }
}
