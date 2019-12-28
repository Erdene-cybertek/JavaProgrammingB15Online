package day20;

public class PalindromeTest {

    public static void main(String[] args) {

     // Palindrome --> If you reverse a String, it does not change it's means
     // it means the string is called Palindrome

        String name = "kayak";
        // Homework "Nurses run" - pass palindrome test this name!!!
        String reversedName= "" ;

        for (int i = name.length() -1 ; i >= 0 ; i--) {
            reversedName += name.charAt(i);
        }

        System.out.println(reversedName);

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("Palindrome test has passed");
        } else {
            System.out.println("Palindrome test has failed");
        }

    }
}
