package day12_Must_Practice;

public class CarShopping {

    public static void main(String[] args) {

      // Buy corolla or tesla (only if it's within the budget)

        String carBrand="corolla";
        int carPrice = 30000;
        int budget = 40000 ;

        if (carBrand.equals("corolla") || (carBrand.equals("tesla") && carPrice <= budget) ) {
            System.out.println("Buy it");
        } else {
            System.out.println("don't buy it");
        }





    }
}
