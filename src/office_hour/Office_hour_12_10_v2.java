package office_hour;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Office_hour_12_10_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();
        String[] languages = {l1, l2, l3};
        System.out.println(Arrays.toString(languages));
        
       for (String bla : languages)
        System.out.println("languages = " + bla);
    }
}
