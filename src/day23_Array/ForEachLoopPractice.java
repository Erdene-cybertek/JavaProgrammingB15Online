package day23_Array;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
         * Create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         * Optionally : print only the salary more than 10000
         */

        long[] salaries = new long[]{100000L, 110000L, 90000L, 95000L, 120000L};

        for (long eachSalary : salaries) {

            if (eachSalary >= 100000) {
                System.out.println("Each Salary = " + eachSalary);
                continue;
            }

        }
    }
}
