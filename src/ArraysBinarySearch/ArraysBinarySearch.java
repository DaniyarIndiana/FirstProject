package ArraysBinarySearch;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int [] number = {45,23,6,-3,66};
        Arrays.sort(number);
        System.out.println(Arrays.binarySearch(number,-3));
    }
}
