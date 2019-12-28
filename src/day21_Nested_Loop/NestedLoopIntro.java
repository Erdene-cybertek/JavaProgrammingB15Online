package day21_Nested_Loop;

public class NestedLoopIntro {

    public static void main(String[] args) {

//        for (int i = 1; i < 5 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < 5 ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < 5 ; i++) {
//            System.out.print(i + " ");
//        } System.out.println();

        for (int x = 1; x <=3 ; x++) {
            System.out.println("Iteration " + x);

            for (int i = 1; i < 5 ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
