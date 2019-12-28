package day09;

public class Practice_Language {

    public static void main(String[] args) {

        int dayCode = 2;
        String language;

        if (dayCode == 1) {
            language = "Hello";
        } else if (dayCode == 2) {
            language = "Salam";
        } else if (dayCode == 3) {
            language = "Hola";
        } else if (dayCode == 4) {
            language = "Privet";
        } else if (dayCode == 5) {
            language = "Merhaba";
        } else if (dayCode == 6) {
            language = "Szia";
        } else if (dayCode == 7) {
            language = "Bonjour";
        } else {
            language = "Unknown";
        }

        System.out.println(language);
    }
}

