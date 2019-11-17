package ReplitTask;

import java.util.Arrays;
//1. Take values at index 0 and last index and swap them
//2. Take values at index 0+1 and last index-1 and swap them
//3. Keep repeating step 1 and 2 using a loop until you reach,
// the middle of the array (nums.length /2)
public class ArrayReverseArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 44, 1, 100, 55};
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(nums));
    }
}
