package day20;

public class ReversingAString {

        public static void main(String[] args) {

            // given a String variable name with value
            // reverse this name and store reversed value into
            //another String variable reversed name
    //                     01234567
            String name = "Jon Snow" ;
            String reservedName = "";  // "" enen deer ug nemegdene example: "J" , "Jo" , "Jon"
                                       // hooson orhivol yamar ch ug nemegdehgui "" zaaval hii

            System.out.println(" ");
        //       name.length() - 1 = 7
            for (int i = name.length() - 1 ; i >= 0 ; i--) {

                reservedName += name.charAt(i);
            }

            System.out.println("reservedName = " + reservedName);

            //                76543210
            // reservedName = wonS noJ

    }
}


//           System.out.print( name.charAt(7));
//           System.out.print( name.charAt(6));
//           System.out.print( name.charAt(5));
//           System.out.print( name.charAt(4));
//           System.out.print( name.charAt(3));
//           System.out.print( name.charAt(2));
//           System.out.print( name.charAt(1));
//           System.out.print( name.charAt(0));
