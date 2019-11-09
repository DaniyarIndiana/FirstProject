package CreateMethod;

import java.util.Arrays;

public class PrintArraySeparateWithComma {
    public static void main(String[] args) {
        int[] number = {1,2,3,3,4,4,6};
        separate(number);

    }
    public static void separate (int [] arr){
        String replace = "[";
        for(int num : arr){
            replace += num + ", ";

        }
        replace=replace.substring(0,replace.length()-2) + "]";

        System.out.println(replace);
    }

}
