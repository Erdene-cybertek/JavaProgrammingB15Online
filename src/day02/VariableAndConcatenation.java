package day02;

public class VariableAndConcatenation {

    public static void main(String[] args) {


        int hourOfCoding = 10 ;

        System.out.println(hourOfCoding);

        // Concatenation is combining two pieces of information

        System.out.println( "the hour of Coding is " + hourOfCoding);

        // create a variable for you birth year
        // create a variable for your age
        // create a variable for your family member count
        // create a variable for monitor count
        // create a variable for area code
        // create a variable for desired salary
        // print them in this format
        ///  my birth years : yourBirthYearVariable
        /// andso on

        int birthYear = 1990 ;
        int age = 29 ;
        int familyMemberCount = 3 ;
        int monitor4Count = 2 ;
        int areaCode = 22003 ;
        int desired$ = 100000 ;

        System.out.println("My birth year is " + birthYear);
        System.out.println("My age is "+ age);
        System.out.println("My family count is " + familyMemberCount);
        System.out.println("My monitor count is " + monitor4Count);
        System.out.println("My area code is " + areaCode);
        System.out.println("My desired salary is "+ desired$);

        birthYear = 1987 ;
        age = 32 ;

        System.out.println("My birth year is " + birthYear);

        System.out.println("My birth year is " + birthYear + "." + " My age is " + age);

    }

}
