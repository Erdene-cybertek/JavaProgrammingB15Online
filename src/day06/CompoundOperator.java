package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        // += , -= , *= , /= , %=   are called shorthand operator, compound operator
        // it can simplify the operation if you have same variable
        // on both side of the assignment
        // There is no space between += , -= , *= , /= , %=
        int studentOnline = 263;

 //       studentOnline = studentOnline + 5;
        studentOnline += 5;
        System.out.println("5 people joined the class " + studentOnline);

 //       studentOnline = studentOnline -3;
        studentOnline -= 3;
        System.out.println("3 people left the class " + studentOnline);

 //       studentOnline = studentOnline * 2;
        studentOnline *= 2;
        System.out.println("the student count doubled " + studentOnline);

 //       studentOnline = studentOnline / 3;
        studentOnline /= 3;
        System.out.println("the student dropped to 1/3 : " + studentOnline);




    }
}
