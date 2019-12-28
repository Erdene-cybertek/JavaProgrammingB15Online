package day27_New_teacher;

public class Array_MultiDimension_Shortest_String {

    public static void main(String[] args) {

        String[] developers = {"Jonathan", "Harry", "Erica", "Abide"};
        String[] testers = {"Erdene-Ochir", "Mendsaikhan", "Emma Stonr"};
        String[] businessAnalysts = {"Lisa", "Monica", "Kelsey"};

        String[][] scrumTeam = {developers, testers, businessAnalysts};

        int minLength = scrumTeam[0][0].length();
        String shortestString = "";
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (minLength > eachElement.length()) {
                    minLength = eachElement.length();
                    shortestString = eachElement;
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);

    }
}