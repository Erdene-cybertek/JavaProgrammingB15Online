package day23_Array;

public class CreateArray_Sum {

    public static void main(String[] args) {

        // 1st way to create an array object and add value into index location
        int[] nums = new int[7];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;
        nums[6] = 70;

        //2nd way ________________________________________________
        int[] nums2 = new int[]{10, 20, 30, 40, 50, 60, 70};

        //3rd way _______________________________________________
        int[] nums3 = {10, 20, 30, 40, 50, 60, 70};

        for (int x = nums.length - 1; x >= 0; x--) {
            System.out.println("index = " + nums[x]);
        }

        System.out.println("lastItemIndex = " + (nums.length - 1));
        //
        int middleItemIndex = nums.length/2; //
        System.out.println("middleItemIndex = " + middleItemIndex);;
        //
        int sum = 0;
        for (int x = 0; x < nums.length ; x++) {
            sum += nums[x];
        }
        System.out.println(sum);

    }
}
