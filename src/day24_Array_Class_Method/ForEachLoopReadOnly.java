package day24_Array_Class_Method;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourNumber = 300;
        int myNumber = yourNumber;

        myNumber = 299;
        System.out.println(yourNumber);

        long [] nums = {10, 20 ,30};

        for (int x = 0; x < 3; x++) {
            System.out.println( nums[x] *2);
        }
        
        for (long eachItem : nums) {
            System.out.println("eachItem = " + eachItem);
            eachItem = 100;
        }

        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS

        // how do i know array items are modified or not  re-print

        System.out.println("AFTER WE MODIFY THE VALUE ");
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }
    }
}
