package ArrayExamle;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int [] nums = new int[4];   // arrays start with "zero";-----> 0
        nums[0] = 4;
        nums[1] = 3;
        System.out.println(nums[1] + 1 );
        System.out.println(Arrays.toString(nums));//this method return arrays containers
    }
}
