package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // Given a String with even number character count
        // print 2 characters in one line as below example
        //               0123
        // for example : Arya

        /* Ar 01
           ry 23
           ya 45
         */

        String name = "AryaStark";
 //       System.out.println(name.substring(0,2));
  //      System.out.println(name.substring(1,3));
  //      System.out.println(name.substring(2,4));

        System.out.println();

        for (int x = 0; x <= name.length() - 4; x++) {
            System.out.println(name.substring(x, x+4));
        }
                // x, x+3 >> "3" bol name length-s 1g hasaad "-2" bolno
                // ooroor helbel x+5 bsan bol name.length - 4 baina
        }
}

