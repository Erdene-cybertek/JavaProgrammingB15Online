package day23_Array;

public class ForEachLoop_Max {

    public static void main(String[] args) {

        long[] salaries = {100000L, 110000L, 90000L, 95000L, 120000L};

        long max = salaries[0];

          for (long salary : salaries){
              if (salary > max){
                max = salary;
            }
        }
        System.out.println("maxSalary = " + max);
    }
}
