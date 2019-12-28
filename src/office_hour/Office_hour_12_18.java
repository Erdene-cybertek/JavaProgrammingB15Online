package office_hour;

import java.util.Arrays;

public class Office_hour_12_18 {

    public static void main(String[] args) {
       
        String employee = "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co";

        int startingIndex = employee.indexOf("[") + 1 ;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("title = " + title);

        // Array Method:
//        String [] employeeSplit = employee.split(" ");
//        String firstName = employeeSplit[0];
//        String lastName = employeeSplit[1];
//       String fullName = firstName + "-" + lastName;
//        System.out.println("fullName = " + fullName);

        // String Method
        String fullName = employee.substring(0,employee.indexOf(" ["));
        System.out.println("fullName = " + fullName);
        String fullNameWithDash = fullName.replace(" ","-");
        System.out.println("fullName = " + fullNameWithDash);

        System.out.println(fullNameWithDash + " " + title);

        String email = employee.substring(employee.indexOf("]")+2, employee.length());
        System.out.println("email = " + email);

        if (title.equals("Electrical Engineer")) {
            System.out.println("PASS: Verification Successful");
        } else {
            System.out.println("FAIL: Verification fail : " + title);
        }

        System.out.println(fullName.charAt(0) + "" +
                           fullName.charAt(fullName.lastIndexOf(" ")+1));

    }
}
