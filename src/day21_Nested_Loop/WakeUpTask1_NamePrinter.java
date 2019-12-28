package day21_Nested_Loop;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {
//                       012345678901234567
        String myName = "Erdene Mendsaikhan";

            for (int y = 0; y < myName.length()-1; y++) {

                if (myName.substring(y, y + 2).equalsIgnoreCase("en") ) {

                    System.out.println("The index or location of 'an' is " + y);
                }
            }

    }
}
