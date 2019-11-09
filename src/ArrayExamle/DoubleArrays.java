package ArrayExamle;

import java.util.Arrays;

public class DoubleArrays {
    public static void main(String[] args) {
        double[] arr = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1] = 112.89;// with this minus -1 we are replace last digit or characters
        System.out.println(Arrays.toString(arr));
    }
}
