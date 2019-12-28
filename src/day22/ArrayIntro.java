package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        int num1 = 10;
        System.out.println("num1 = " + num1);
        num1 = 100;

        // dataType [] variableName = new dataType [count of item ] ;

        int [] scores = new int [4];  // 4 shiheg scores hiij bolno

        scores [0] = 95 ;
        scores [1] = 70 ;
        scores [2] = 88 ;
        scores [3] = 100 ;

        System.out.println(  scores [0]  );
        System.out.println(  scores [1]  );
        System.out.println(  scores [2]  );
        System.out.println(  scores [3]  );

        scores [1] = 99;
        System.out.println(scores [1]);


    }
}
