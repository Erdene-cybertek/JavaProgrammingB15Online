package day27_New_teacher;

public class Array_Max {

    public static void main(String[] args) {

        int[] scores = {100, 897, 654, 32, 1231, 224, 556, 7, 1, 2, 3, 4};

        int max = scores[0];
        for (int y = 0; y < scores.length; y++) {
            if  (max < scores[y]) {
                max = scores [y];
            }
        }
        System.out.println(max );

        System.out.println("=====================================================");

    // Let's find 2nd max number

        int secondMax = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(secondMax <  scores[i] && scores[i] != max){
                secondMax = scores[i];
            }
        }
        System.out.println("second max number: "+secondMax);


    }
}
