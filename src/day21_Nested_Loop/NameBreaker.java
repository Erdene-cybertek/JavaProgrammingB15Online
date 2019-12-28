package day21_Nested_Loop;

public class NameBreaker {

    public static void main(String[] args) {

        String name = "Erdene";

        for (int x = 0; x < name.length()-1 ; x++) {

            System.out.println(name.charAt(x));
            if (name.charAt(x) == 'd' || name.charAt(x) == 'D' ) {
                System.out.println("find it");
                break;
            }
        }
        System.out.println("______________2nd option____________");

        for (int i = 0; i < name.length(); i++) {

            System.out.println(name.substring(i, i + 1));
            if (name.substring(i, i + 1).equalsIgnoreCase("d")) {
                System.out.println("found it");
                break;
            }

        }

    }
}
