import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortFindBiggestNumberSmallest {
    public static void main(String[] args) {
        int[] number = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(number);
        System.out.println("Biggest number: "+ number[number.length-1]);
        System.out.println("Smallest number: "+ number[0]);
    }
}