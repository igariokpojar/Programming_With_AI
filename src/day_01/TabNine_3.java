package day_01;

import java.util.Arrays;

public class TabNine_3 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 0, 5, 0, 0, 6, 0, 7};
        int[] result = moveZerosToEnd(nums);
        System.out.println(Arrays.toString(result));  // Output: [1, 3, 5, 6, 7, 0, 0, 0, 0, 0]  (zeros moved to the end)
    }

    // crate a function that can move all zeros to the end of an array and return array


    public static int[] moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {
                    int temp = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
        return nums;
    }
}

