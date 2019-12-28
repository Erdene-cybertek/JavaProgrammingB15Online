package day27_New_teacher;

public class Array_MultiDimension_Longest_String {

    public static void main(String[] args) {

        String[] developers = {"Jonathan", "Harry", "Eric", "Abide"};
        String[] testers = {"Erdene-Ochir", "Mendsaikhan", "Emma"};
        String[] businessAnalysts = {"Lisa", "Monica", "Kelsey"};

        String[][] scrumTeam = {developers, testers, businessAnalysts};

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {
                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);

    }
}