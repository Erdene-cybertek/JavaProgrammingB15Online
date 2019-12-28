package day11;

public class WarmUp_LightONOff {

    public static void main(String[] args) {

        String targetOption= "Bd";

        switch (targetOption) {

            case "Bd":
                targetOption = "bedroom";
                break;
            case "Lr":
                targetOption = "Livingroom";
                break;

            case "Ki":
                targetOption = "Kitchen";
                break;

            case "Ha":
                targetOption = "Hallway";
                break;

            default:
                targetOption = "unknown";
                break;

        }
        System.out.println("You have turned on " + targetOption + " light");


        }
}
