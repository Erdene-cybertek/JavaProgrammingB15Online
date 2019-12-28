package day25_Char_Array_Split_Sort;

import java.util.Arrays;

public class Arrays_Sort_Checking {

    public static void main(String[] args) {

        int[] nums = {13, 31, 8, 5, 21, 2};

        int[] nums2 = new int[nums.length];
//        nums2[0] = nums[0];
//        nums2[1] = nums[1];
//        nums2[2] = nums[2];
//        nums2[3] = nums[3];
//        nums2[4] = nums[4];
//        nums2[5] = nums[5];

        for (int x = 0; x < nums.length; x++) {
            nums2 [x] = nums [x];
        }

        System.out.println("Before sorted : " + Arrays.toString(nums2));

        Arrays.sort(nums2);

        System.out.println("After sorted : " + Arrays.toString(nums2));

        if (Arrays.equals(nums, nums2)) {  // nums==nums2
            System.out.println("Sorted!");
        } else {
            System.out.println("Not sorted!");
        }

    }
}