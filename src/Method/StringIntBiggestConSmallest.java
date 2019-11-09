package Method;

import java.util.Arrays;

public class StringIntBiggestConSmallest {
    public static void main(String[] args) {
        System.out.println(differenceFromString("994647440"));
    }
    public static int differenceFromString(String numbers){
        String[] arr = numbers.split("");
        Arrays.sort(arr);
        return Integer.valueOf(arr[arr.length-1])-Integer.valueOf(arr[0]);


    }
}
