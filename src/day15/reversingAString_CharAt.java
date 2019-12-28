package day15;

public class reversingAString_CharAt {

    public static void main(String[] args) {

        String name = "Erdene";

        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2)
               + " " + name.charAt(3) + " " + name.charAt(4) + " " + name.charAt(5));

        System.out.println(name.charAt(5) + " " + name.charAt(4) + " " + name.charAt(3)
                + " " + name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0));

        // How do you find out last Character of any String
        // counting character start with 1
        // counting index (location ) start with 0
        // so last character index/location will be always one less than actual character count

        // Erdene has 6 character
        // 01234 and last character index is 5 NOT 6    6-1=5

        int characterCount = name.length();
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println("Last Char is " + lastChar);
        System.out.println("Last Char is " + name.charAt( name.length()-1 ));



    }
}
