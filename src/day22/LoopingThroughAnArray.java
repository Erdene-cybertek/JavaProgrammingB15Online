package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        int [] scores = new int [4];

        scores [0] = 95 ;
        scores [1] = 70 ;
        scores [2] = 88 ;
        scores [3] = 100 ;

//        System.out.println(  scores [0]  );
//        System.out.println(  scores [1]  );
//        System.out.println(  scores [2]  );
//        System.out.println(  scores [3]  );

        for (int x = 0; x < scores.length; x++) {
            System.out.println(scores[x]);

        }
        System.out.println("______________Reserved order____________");

        for (int y = scores.length - 1; y >= 0 ; y--) {
            System.out.println(scores[y]);
        }

    }
}

