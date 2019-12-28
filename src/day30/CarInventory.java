package day30;

public class CarInventory {

    public static void main(String[] args) {

        String[] cars = {"BMW-M6",
                "Mazda-929",
                "Pontiac-Grand Am",
                "Chevrolet-3500",
                "Infiniti-Q",
                "Ford-GT",
                "GMC-Savana 3500",
                "Mercedes-Benz-S-Class",
                "Volkswagen-Passat",
                "Volvo-XC60",
                "Saturn-Ion",
                "Spyker-C8",
                "Acura-ZDX",
                "Jeep-Patriot",
                "Honda-Civic",
                "Chevrolet-Colorado"};

        // Task1 : count Chevrolet and civic
        // we can use contains , startWith , endWith to get same result
        int chevyCNT = 0;
        int civicCNT = 0;

        for (String eachCar : cars) {

            //if(eachCar.startsWith("Chevrolet")){
            // what if I want case insensitivity
            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                chevyCNT++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCNT++;
            }

        }
        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println("civicCNT = " + civicCNT);

    }

}
