package day27_New_teacher;

public class Array_Min {

    public static void main(String[] args) {

         /* Task2
           Write a program that  can find the minimum number from an int array
           Do not use Sort method
         */

        int[] scores = {100, 897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};
        int min = scores[0];

        for (int x = 0; x < scores.length; x++) {
            if (min > scores[x]){
                min = scores[x];
            }
        }
        System.out.println(min);

        // Let's find 2nd minimum number
        int secondMin = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == min){
                continue;
            }
            if (secondMin > scores[i]) {
                secondMin = scores[i];
            }
        }
        System.out.println(secondMin);

        // 3rd Min number

        int thirdMin = scores[0];
        for (int z = 0; z < scores.length; z++) {
            if(scores[z]==min || scores[z] == secondMin){
                continue;
            }
            if (thirdMin > scores[z]) {
                thirdMin = scores[z];

                /*
                if(thirdMin >scores[i] && scores[i] != min && scores[i] !=secondMin){
                    thirdMin = scores[i];
                    */
            }
        }

        System.out.println(thirdMin);



    }

}
