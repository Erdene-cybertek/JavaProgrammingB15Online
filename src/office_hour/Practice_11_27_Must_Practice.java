package office_hour;

import jdk.swing.interop.SwingInterOpUtils;

public class Practice_11_27_Must_Practice {

    public static void main(String[] args) {

        /*
        equals
        equalsIgnoreCase
        length
        toUpperCase
        toLowerCase
        startsWith
        endsWith
        charAt
        contains
        indexOf
        lastIndexOf
        trim
        isEmpty
         */

        String message = " I LOVE  JAVA  " ;
        System.out.println("message = <" + message + ">"   );
        // trim -->> take out spaces at beginning of a String object.
        String messageTrimmed = message.trim();
        System.out.println("message = <" + messageTrimmed + ">"   );
        // Zovhon 2 taliin space TRIM hiij bagasgana.
        // Dundah space oorchlogdohgui
        // exapmle: message = < A  BC     >
        //          message = <A  BC>

        String emptySpaces = "    1    ";
        System.out.println("emptySpace = <" + emptySpaces + ">"   );

        String emptySpaceAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is : " +  emptySpaceAfterTrimmed.length()   );
        System.out.println("emptySpacesAfterTrimmed is empty ??? : " +  emptySpaceAfterTrimmed.isEmpty()   );

        // isEmpty -->> yourString.length()>0 true else it's false
        // isBlank -->> if you have only white spaces, get true , else get false

        // indexOf -->> Give you location of the string you are looking for inside anotherString
        // for example yourString.indexOf("abc")                         01234567890123456
        // copied from above so we can see what we haveString message = "  I LOVE  JAVA   " ;

        int locationOfLove = message.indexOf("LOVE");
        System.out.println("location Of word Love = " + locationOfLove);

        // lastIndexOf --> give you last location of the string you are looking for inside anotherString
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("last IndexOf Letter A = " + lastIndexOfLetterA);

        // contains : -->> check whether a String exists inside another String and return true false
        //    contains works exactly same as  --->>> yourString.indexOf("anotherStr") > -1  or >=0
        boolean messageContainsLove = message.contains("LOVE");
        System.out.println("message Contains Love = " + messageContainsLove);








    }
}
