package office_hour;

public class Office_hour_12_10 {

    public static void main(String[] args) {

        String [] cars = {"BWM", "Toyota", "Audi"};

        for (int x = 0; x < cars.length; x++) {
            System.out.println(cars[x]);
        }

        for (String carModels : cars){

            System.out.println("carModels = " + carModels);
        }
            /*
            carModels = BWM
            carModels = Toyota
            carModels = Audi
             */

        int[] ages = {23, 43, 5, 7, 87};

        System.out.println(ages[3]-ages[2] );  // =2


    }
}
