package VarargsMethod;

import java.util.Arrays;

public class ExampleVarargsMethod {
    public static void main(String[] args) {
        maxNumber(3,45,54,54,6,6);
    }
    public static void maxNumber(int ... arr){
        Arrays.sort(arr);
        System.out.println("The biggest number is " + arr[arr.length-1]);
    }
}
