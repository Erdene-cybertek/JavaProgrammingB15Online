package office_hour;

public class Practice_12_02 {

    public static void main(String[] args) {
        //             012345678901234567890123456
        String item = "Echo Dot (3rd Gen) Charcoal" ;
        // get whatever is inside parenthesis ( )

        // find out index of ( and index of ) , use them for substring to get the text

        System.out.println( item.substring(9, 18));

        int x = item.indexOf("(");
        int y = item.indexOf(")");
        
        String wordInsideParenthesis = item.substring(x + 1, y);

        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);
        
        // --------------
        String letters = "J%a^V**$1a(";
        // remove % * ^ 1 $ (

        letters = letters.replace("%","")
                .replace("*","")
                .replace("1","")
                .replace("$","")
                .replace("^","")
                .replace("(","")
                .toUpperCase();
        System.out.println("letters = " + letters);
                
//   -----------------------
        //             0123456789
        String name = "Arya Stark";

        // getting each character using CharAt(index)
        // generate sequential number 0 ---> 10
        // is there any chance that while loop does not execute

        int t = 0 ;

        System.out.println(name.length());

        while (t < name.length()) {
            System.out.println("index : " + t + " | " + name.charAt(t));
            ++t;
        }



    }

}
