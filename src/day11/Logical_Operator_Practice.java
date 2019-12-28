package day11;

public class Logical_Operator_Practice {

    public static void main(String[] args) {

        int x = 55;

        System.out.println(" ----  x > 100 || x < 10 ---- ");
        System.out.println(x > 100 || x < 10);

        System.out.println(" ----  x > 10 && x < 60 ---- ");
        System.out.println(x > 10 && x < 60);

        System.out.println("result of true || false || false  ");
        System.out.println(true || false || false);

        System.out.println("result of true && true && false   ");
        System.out.println(true && true && false);

        System.out.println("running this -->>> x==50  || x==51   ||  x==55   ");
        System.out.println(x == 50 || x == 51 || x == 55);

        System.out.println("running this -->>> x>50 && x != 52  || x==57   ");

        // x is more than 50
        // and x is not equal to 52
        // or  x equal to 57

        System.out.println(x > 50 && x != 52 || x == 57);

        System.out.println(false || true && true);
    }}