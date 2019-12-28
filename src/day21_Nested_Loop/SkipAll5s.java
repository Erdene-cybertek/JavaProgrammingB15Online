package day21_Nested_Loop;

public class SkipAll5s {

    public static void main(String[] args) {

        for (int x = 0; x <=20 ; x++) {

            if (x % 5 == 0) {
                System.out.println("Skipping " + x);
                continue;
            }

            System.out.println(x);

            if (x == 18){
                break;

            }
        }

    }
}
