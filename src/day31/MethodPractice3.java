package day31;

public class MethodPractice3 {

    public  static void countDownFrom20() {

        for (int x = 20; x > 0; x--) {
            if (x%2==1) {
                System.out.print(x + " ");
            }
        }

    }

    public static void spellName (){

        String name = "Erka";
        for (int x = 0; x <name.length() ; x++) {
            System.out.print(name.charAt(x) + "-");
        }
    }

    public static void main(String[] args) {

        countDownFrom20();
        System.out.println();
        spellName();

    }
}
