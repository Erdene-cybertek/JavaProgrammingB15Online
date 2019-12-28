package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class Arrays_Sort_Checking_Version2 {

    public static void main(String[] args) {

        int[] nums = {13, 31, 8, 5, 21, 2};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        for (int x = 0; x < nums.length- 1; x++) {
            System.out.println(nums[x] + " is less than " + nums[x+1] + " -->> TRUE or False : " + (nums[x] < nums[x + 1]));

            if (!(nums[x] < nums[x + 1])) {
                System.out.println("Array is not sorted " + nums[x] + ", " + nums[x+1] + ", no point checking the rest");
                break;

            }

        }


    }
}