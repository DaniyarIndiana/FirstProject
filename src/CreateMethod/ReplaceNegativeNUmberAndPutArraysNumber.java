package CreateMethod;

import java.util.Arrays;

public class ReplaceNegativeNUmberAndPutArraysNumber {
    public static void main(String[] args) {
        int [] arr2 ={-1,3,4,-4,-2,5,-32};
        replaceNegative(arr2,100);
    }
    public static void replaceNegative(int[] arr, int change){

        for (int i =0; i <arr.length; i++){
            if(arr[i]<0){
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
