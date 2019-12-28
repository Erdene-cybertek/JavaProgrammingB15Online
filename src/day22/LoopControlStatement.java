package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg = "I struggle with Java I love Java Everything is Awesome! ";

        for (int x = 0; x < msg.length() ; x++) {

//            System.out.println(msg.substring(x, x+1));

            if (x % 2 == 1) {  // it skips every odd index of character
            continue;

            }

            if (msg.substring(x, x+1).equalsIgnoreCase("J")){
                break;    // it stops if letter at "J"

            }

            System.out.print(msg.substring(x, x+1));
        }
    }
}
