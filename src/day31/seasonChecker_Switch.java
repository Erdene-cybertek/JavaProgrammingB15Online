package day31;

public class seasonChecker_Switch {

    public static void main(String[] args) {

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        String mySeason = "AAAA";
        decideSeasonAction(mySeason);

        System.out.println("AAAA");  /// you can directly pass AAAA to the method
        System.out.println(mySeason);// or you can pass a variable that has value AAAA to the method
    }

    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside method body
        switch (season) {

            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("INVALID SEASON");

        }

    }



}
